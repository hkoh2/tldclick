package com.hk.tldclick.dao;

import com.hk.tldclick.entity.Link;

import java.util.List;

public interface LinkDAO {
    void save(Link link);
    Link findById(Integer id);
    List<Link> findAll();
    List<Link> findById();
    void update(Link theLink);
    void delete(Integer Id);
    Integer saveAndGetId(Link theLink);

}
