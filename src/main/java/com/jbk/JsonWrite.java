package com.jbk;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

public class JsonWrite {
	
	public static void main(String[] args) throws Exception {
		
		JSONObject jo=new JSONObject();
		jo.put("Name", "Ajay");
		jo.put("Email", "ajaymandhare33@gmail.com");
		jo.put("Address", "Pune");
		jo.put("Phoneno", "9130234015");
		
		
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(15);
		al.add(17);
		al.add(50);
		al.add(80);
		//jo.put("Arraylist", al);
		
		
		PrintWriter pw=new PrintWriter("jsonDemo.json");
			pw.write(jo.toString());
			pw.flush();
			pw.close();
			System.out.println("Recorede addred in josnDemo jeson file");
	}

}
