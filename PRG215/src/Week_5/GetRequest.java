package Week_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetRequest {
	public static void sendGet(String url) throws Exception {
		String returnValue;
		do{
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Java");

        int responseCode = con.getResponseCode();
        System.out.print("\nGET " + url);
        System.out.print(" : " + responseCode + " : ");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        
        returnValue = response.toString();
		}while(returnValue.startsWith("<"));
		System.out.println(returnValue);
		
    }
}