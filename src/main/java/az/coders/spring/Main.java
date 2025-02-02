package az.coders.spring;

import az.coders.spring.config.SpringHibernateConfig;
import az.coders.spring.dao.CategoryDao;
import az.coders.spring.dao.ProductDao;
import az.coders.spring.domain.Category;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringHibernateConfig.class);
       ProductDao productDao= applicationContext.getBean("productDaoImpl", ProductDao.class);
      // categoryDao.save(new Category(1111,"Narin","sweet"));
//        Category category = new Category();
//        category.setId(1111);
//        category.setName("Vusale");
//        categoryDao.update(1111, category);
//        System.out.println(categoryDao.findAll());
//        categoryDao.delete(1111);
        System.out.println(productDao.findAll());
    }
}