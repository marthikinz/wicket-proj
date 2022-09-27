package com.mycompany;

public interface SomethingDao
{
	Something load(long id);
	Something save(Something contact);
	int count(Something filter);
}
