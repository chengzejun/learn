package com.chengzejun.user.service;

import com.chengzejun.user.entity.User;

public interface UserService {

    User findById(Long id);

    void save(User user);

    void update(User user);

    void delete(Long id);
}
