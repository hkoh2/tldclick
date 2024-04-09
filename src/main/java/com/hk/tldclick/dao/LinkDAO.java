package com.hk.tldclick.dao;

import com.hk.tldclick.entity.Link;

import java.util.List;

public interface LinkDAO {
    void save(Link link);
    Link findById(Integer id);
    List<Link> findAll();
    List<Link> findById();
    Link findByKey(String key);
    void update(Link theLink);
    void delete(Integer Id);
    String saveAndGetId(Link theLink);

}
