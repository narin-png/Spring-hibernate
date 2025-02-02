package az.coders.spring.dao.impl;

import az.coders.spring.dao.CommonDao;
import az.coders.spring.domain.Category;
import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public class CommonDaoImpl<E,T> implements CommonDao<E,T> {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void save(E entity) {
sessionFactory.getCurrentSession().save(entity);
    }

    @Override
    public void update(int id, E entity) {
sessionFactory.getCurrentSession().update(entity);
    }

    @Override
    public void delete(T id) {
sessionFactory.getCurrentSession().delete(findById(id));
    }

    @Override
    public Category findById(T id) {
        return sessionFactory.getCurrentSession().get(Category.class, id);
    }

    @Override
    public List<E> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from E").list();
    }
}
