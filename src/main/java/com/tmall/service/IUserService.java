package com.tmall.service;

import com.tmall.common.ServerResponse;
import com.tmall.pojo.User;

public interface IUserService {

    ServerResponse<User> login(String username, String password);
}
