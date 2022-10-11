package com.mycompany;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.model.Something;

@Component
public class SomeInit implements InitializingBean{
	
	@Autowired
	private SomethingDao somethingDao;

	@Override
	public void afterPropertiesSet() throws Exception {
		Something something = new Something();
		something.setName("testingxxx");
		somethingDao.save(something);
	}

}
