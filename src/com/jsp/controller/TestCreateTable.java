package com.jsp.controller;
import com.jsp.service.PersonService;
import com.jsp.service.PersonService;

public class TestCreateTable {
	public static void main(String[] args) {
		PersonService  personService = new PersonService();
		int res = personService.createTableService();
		if(res==0) {
			System.out.println("table created");
		}
		else {
			System.out.println("plz check the code");
		}
		
	}

}
