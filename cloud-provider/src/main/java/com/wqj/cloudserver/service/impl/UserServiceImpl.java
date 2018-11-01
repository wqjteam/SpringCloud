package com.wqj.cloudserver.service.impl;

import com.wqj.cloudserver.bean.User;
import com.wqj.cloudserver.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: wqj
 * @Date: 2018/10/31 16:54
 * @Description:
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {


    public User findUserById(Long id) {

        Map<Long, User> users = new HashMap<>();
        users.put(1L, new User(1L, "xiaxuan", 24));
        users.put(2L, new User(2L, "bingwen", 24));
        return users.get(id);
    }
}
