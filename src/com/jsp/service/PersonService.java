package com.jsp.service;

import com.jsp.dao.Persondao;

public class PersonService {
	Persondao dao= new Persondao();
	public int createTableService() {
	return dao.createTable();

}
}
