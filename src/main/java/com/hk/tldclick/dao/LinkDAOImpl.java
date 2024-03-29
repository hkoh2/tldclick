package com.hk.tldclick.dao;

import com.hk.tldclick.entity.Link;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LinkDAOImpl implements LinkDAO {

    private EntityManager entityManager;

    @Autowired
    public LinkDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Link link) {

    }

    @Override
    public Link findById(Integer id) {
        return null;
    }

    @Override
    public List<Link> findAll() {
        TypedQuery<Link> linkQuery = entityManager.createQuery("FROM Link", Link.class);
        return linkQuery.getResultList();
    }

    @Override
    public List<Link> findById() {
        return null;
    }

    @Override
    public void update(Link theLink) {

    }

    @Override
    public void delete(Integer Id) {

    }
}
