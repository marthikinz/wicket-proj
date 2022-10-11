package com.mycompany;

import com.mycompany.model.Something;

public interface SomethingDao {
	public Something load(long id);

	public Something save(Something something);

	public int count(Something filter);
}
