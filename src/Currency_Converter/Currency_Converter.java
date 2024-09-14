package Currency_Converter;

import java.util.Scanner;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.util.InputMismatchException;
import java.io.IOException;

public class Currency_Converter
{

	//API's Key And URL
	private static final String API_KEY = "43bdb5cfc0624ebffb2845ae";
	private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

	//main method
	public static void main(String[] args) throws IOException, InterruptedException
	{

		Scanner sc = new Scanner(System.in);

        System.out.println("|--------------------Let's Convert Currency-----------------------|");
       
		// String method's For Input Base And Target Currency to Convert Amount 	
		String base_Currency = CurrencyInput(sc, "\n\n1>>Enter Your base currency (e.g. USD, EUR, JPY ):");
		String target_Currency = CurrencyInput(sc, "2>>Enter Your target currency (e.g. USD, EUR, JPY):");
		double amount = AmountInput(sc, "\nEnter Amount You Want To convert:");

		//Method To Collect User Input
		double response = ExchangeRate(base_Currency, target_Currency);

		//Check response
		if (response != 0)
		{
			double exchange_Rate = response;
			double convertedAmount = amount * exchange_Rate;

			System.out.println("1 " + base_Currency + " = " + exchange_Rate + " " + target_Currency);
			System.out.println(amount + " " + base_Currency + " = " + convertedAmount + " " + target_Currency);
		} else
		{
			System.out.println("Failed to fetch exchange rate...!!Re Try");
		}
	}

	private static String CurrencyInput(Scanner sc, String User_prompt)
	{
		while (true)
		{
			try
			{
				System.out.println(User_prompt);
				String currency = sc.next().toUpperCase();
				if (currency.length() != 3)
				{
					System.out.println("Invalid Currency Code...Please enter Valid Code (e.g. USD, EUR, JPY).");
				} else
				{
					return currency;
				}
			} catch (Exception e)
			{
				System.out.println("Pls...Enter Valid Input...!!");
				sc.next();
			}
		}
	}

	private static double AmountInput(Scanner scanner, String prompt)
	{
		while (true)
		{
			try
			{
				System.out.println(prompt);
				return scanner.nextDouble();
			} catch (InputMismatchException e)
			{
				System.out.println("Invalid Amount. Please Enter a Number.");
				scanner.next();
			}
		}
	}

	private static double ExchangeRate(String baseCurrency, String targetCurrency)
			throws IOException, InterruptedException
	{
		HttpClient client = HttpClient.newHttpClient();
		String url = API_URL + baseCurrency + "/" + targetCurrency;
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

		try
		{
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			if (response.statusCode() == 200)
			{
				String responseBody = response.body();
				int startIndex = responseBody.indexOf("conversion_rate") + 17;
				int endIndex = responseBody.indexOf(",", startIndex);
				if (endIndex == -1)
				{
					endIndex = responseBody.indexOf("}", startIndex);
				}
				if (startIndex > 16 && endIndex > startIndex)
				{
					String rateString = responseBody.substring(startIndex, endIndex);
					return Double.parseDouble(rateString);
				} else
				{
					System.out.println("Conversion rate not found in response.");
					return -1; // Indicate an error
				}
			} else
			{
				System.out.println("API error: " + response.statusCode());
				return -1; // Indicate an error
			}
		} catch (IOException | InterruptedException e)
		{
			System.out.println("Error fetching exchange rate: " + e.getMessage());
			return -1; // Indicate an error
		}
	
	}//end of main method

}//end of main class


