package az.coders.spring.dao.impl;

import az.coders.spring.dao.CategoryDao;
import az.coders.spring.dao.CommonDao;
import az.coders.spring.domain.Category;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
@Transactional
public class CategoryDaoImpl extends CommonDaoImpl<Category,Integer> implements CategoryDao  {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void findByName(String name) {

    }


//    @Override
//    public void save(Category category) {
//        sessionFactory.getCurrentSession().persist(category);
//    }
//
//    @Override
//    public void update(int id,Category category) {
//        sessionFactory.getCurrentSession().merge(category);
//    }
//
//    @Override
//    public void delete(int id) {
//sessionFactory.getCurrentSession().remove(findById(id));
//    }
//
//    @Override
//    public Category findById(int id) {
//        return sessionFactory.getCurrentSession().get(Category.class, id);
//    }
//
//    @Override
//    public List<Category> findAll() {
//        return sessionFactory.getCurrentSession().createQuery("from Category c ").list();
//    }


}
