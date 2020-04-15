package com.capg.dao;

import com.capg.entities.Customer;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CustomerDaoImpl implements ICustomerDao {


    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public Customer findById(int id) {
        Customer user = entityManager.find(Customer.class, id);
        return user;
    }


    @Override
    public Customer updateCustomer(Customer customer) {
        customer = entityManager.merge(customer);
        return customer;
    }

    @Override
    public Customer save(Customer customer) {
        customer = getEntityManager().merge(customer);
        return customer;
    }

}
