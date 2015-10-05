package org.test.just_fun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

public class GoogleSearch {

	public static void main(String[] args) throws IOException {
		 
		String address = "http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q=";
		String query = "java tutorial";
		String charset = "UTF-8";
		String n�got = "";
		
		URL url = new URL(address + URLEncoder.encode(query, charset));
	 
		BufferedReader in = new BufferedReader(new InputStreamReader(
				url.openStream()));
		String str;
	 
		while ((str = in.readLine()) != null) {
			for(String s : str.split(","))
					{
						System.out.println(s);
					}
			System.out.println(str);
		}
	 
		in.close();
	}
	
}
