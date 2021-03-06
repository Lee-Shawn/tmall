package com.tmall.common;

/**
 * 常量类
 */
public class Const {

    /**
     * 当前用户
     */
    public static final String CURRENT_USER = "currentUser";

    /**
     * 邮箱
     */
    public static final String EMAIL = "email";

    /**
     * 用户名
     */
    public static final String USERNAME = "username";

    /**
     * 用户角色
     */
    public interface Role {
        // 普通用户
        int ROLE_CUSTOMER = 0;

        // 管理员
        int ROLE_ADMIN = 1;
    }

}
