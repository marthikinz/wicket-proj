package com.mycompany;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.model.Something;
import com.mycompany.repository.SomethingRepository;

@Service
public class SomeServiceImpl implements SomeService{
	
	@Autowired
	private SomethingRepository somethingRepository;

	@Override
	public String getSomeMessag() {
		List<Something> s = somethingRepository.findByName("testing");
		return s.get(0).getName();
	}

}
