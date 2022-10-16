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
		Something something = Something.builder().name("testingxx").number(1).build();
		somethingRepository.save(something);
		Something something1 = Something.builder().name("testingzz").number(2).build();
		somethingRepository.save(something1);
	}

}
