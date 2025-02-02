package az.coders.spring.dao;

import az.coders.spring.domain.Product;

import java.util.List;

public interface ProductDao extends CommonDao<Product,Integer>  {
    List<Product> findByName(String name);
}
