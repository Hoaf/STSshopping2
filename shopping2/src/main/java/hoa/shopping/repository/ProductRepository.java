package hoa.shopping.repository;

import hoa.shopping.entities.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findById(int id);
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    public List<Product> findAll(){
//        Session session = this.sessionFactory.openSession();
//        Transaction transaction = null;
//        try{
//            transaction = session.beginTransaction();
//            Query query = session.createQuery("FROM Product");
//            List<Product> list = query.list();
//            transaction.commit();
//            return list;
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            session.flush();
//            session.close();
//        }
//        return (List<Products>)session.createSQLQuery("SELECT * FROM Products").addEntity(Products.class).list();
//    }

}
