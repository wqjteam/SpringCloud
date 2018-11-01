package com.wqj.cloudserver.service;

import com.wqj.cloudserver.bean.User;

/**
 * @Auther: wqj
 * @Date: 2018/10/31 16:54
 * @Description:
 */
public interface UserService {
    public User findUserById(Long id);
}
