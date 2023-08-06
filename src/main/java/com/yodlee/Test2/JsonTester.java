package com.yodlee.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTester {
	public static JSONObject createJson(Map<Integer, String> value) {
	    JSONObject result = new JSONObject();
	    JSONArray addresses = new JSONArray();
	    result.put("addresses", addresses);

	   /* value.entrySet().stream().filter(x -> x.getKey().intValue()==876234876 )    //iterate the map
	        .map(e -> {                 //build an object
	            JSONObject address = new JSONObject();
	            //address.put("address", e.getKey());
	           address.put("domain", e.getValue());
	            return address;
	        }) 
	        .forEach(addresses::put); */  //insert into the array

	    for(Entry<Integer, String> m : value.entrySet()) {
	    	if(m.getKey()==876234876) {
	    		JSONObject address = new JSONObject();
	    		address.put("domain", m.getValue());
	            return address;
	    	}
	    }
	    
	    return result;
	}
	
	public static void main(String[] args) {
	    Map<Integer, String> values = new HashMap<>();
	    values.put(876234876, "google");
	    values.put(34343, "hotmail");
	    values.put(9879892, "google");
	    System.out.println(createJson(values));
	}
}
