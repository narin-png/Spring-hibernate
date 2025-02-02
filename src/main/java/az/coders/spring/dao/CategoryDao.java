package az.coders.spring.dao;

import java.util.List;
import java.util.Locale;
import az.coders.spring.domain.Category;

public interface CategoryDao {
    void findByName(String name);
}
