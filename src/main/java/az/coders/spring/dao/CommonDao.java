package az.coders.spring.dao;

import az.coders.spring.domain.Category;

import java.util.List;

public interface CommonDao<E,T> {
    void save(E entity);
    void update(int id, E entity);
    void delete(T id);
    Category findById(T id);
    List<E> findAll();
}
