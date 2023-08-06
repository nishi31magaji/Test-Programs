package com.yodlee.test;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonTest {
public static void main(String[] args) {
	List<RecurringEvent>reventlist=null;
	Gson gson = new Gson();

	try {
	URL url = new URL("C:\\Users\\nishigandha.magaji\\Downloads\\predicate.json");
	System.out.println(url);
	HttpURLConnection uc = (HttpURLConnection) url.openConnection();
	uc.setRequestMethod("GET");
	uc.connect();
	System.out.println(uc);
	InputStreamReader reader = new InputStreamReader(uc.getInputStream());
	System.out.println(reader.toString());
	reventlist = gson.fromJson(reader, new TypeToken<List<RecurringEvent>>() {}.getType());
	}
	catch(Exception e) {
		
	}
}
}
