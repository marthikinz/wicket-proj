package com.mycompany;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.model.Something;
import com.mycompany.repository.SomethingRepository;

@Component
public class SomeInit implements InitializingBean{
	
	@Autowired
	private SomethingRepository somethingRepository;

	@Override
	public void afterPropertiesSet() throws Exception {
		Something something = new Something();
		something.setName("testing");
		somethingRepository.save(something);
	}

}
