package com.chengzejun.user.service.impl;

import com.chengzejun.user.dao.UserDao;
import com.chengzejun.user.entity.User;
import com.chengzejun.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findById(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public String save(User user) {
       userDao.save(user);
        return null;
    }

    @Override
    public void update(User user) {
       userDao.save(user);
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }
}
