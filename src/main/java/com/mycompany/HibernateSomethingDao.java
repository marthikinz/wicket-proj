package com.mycompany;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.model.Something;

@Repository
@Transactional
public class HibernateSomethingDao implements SomethingDao {

    @PersistenceContext
    private EntityManager entityManager;
	@Override
	public Something load(long id) {
		Something something = entityManager.find(Something.class, id);
		return something;
	}
	@Override
	public Something save(Something something) {
        entityManager.persist(something);
        return something;
	}
	@Override
	public int count(Something filter) {
		return 0;
	}


}
