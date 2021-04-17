package com.yuel.springbootrestful.service.impl;


import com.yuel.springbootrestful.bean.Guest;
import com.yuel.springbootrestful.dao.GuestDao;
import com.yuel.springbootrestful.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestDao dao;

    @Override
    public List<Guest> list() {
        return dao.getlist();
    }

    @Override
    public void add(Guest guest) {
        dao.add(guest);
    }

    @Override
    public void update(Guest guest) {
        dao.update(guest);
    }

    @Override
    public Guest get(String name) {
        return dao.get(name);
    }

    @Override
    public void delete(String name) {
        dao.delete(name);
    }
}
