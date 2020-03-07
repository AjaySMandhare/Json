package com.jbk;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {
	public static void main(String[] args) throws Exception, IOException, ParseException {
		
		Object obj=new JSONParser().parse(new FileReader("jsonDemo.json"));
		JSONObject jo=(JSONObject)obj;
		
		String name=(String) jo.get("Name");
		String Email=(String) jo.get("Email");
		String Address=(String) jo.get("Address");
		String Phoneno=(String) jo.get("Phoneno");
		
		System.out.println(name);
		System.out.println(Email);
		System.out.println(Address);
		System.out.println(Phoneno);
		
	}

}
