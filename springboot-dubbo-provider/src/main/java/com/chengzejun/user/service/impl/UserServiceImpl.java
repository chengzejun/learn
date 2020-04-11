package com.chengzejun.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chengzejun.user.dao.UserDao;
import com.chengzejun.user.entity.User;
import com.chengzejun.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findById(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public void save(User user) {
       userDao.save(user);
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
