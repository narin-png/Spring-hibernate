package az.coders.spring.dao;

import az.coders.spring.domain.Product;

import java.util.List;

public interface ProductDao   {
    void findByName(String name);
}
