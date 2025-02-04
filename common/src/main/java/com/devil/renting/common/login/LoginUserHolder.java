package com.devil.renting.common.login;

/**
 * ClassName：LoginUserHolder
 *
 * @author: Devil
 * @Date: 2025/2/3
 * @Description:
 * @version: 1.0
 */
public class LoginUserHolder {
    public static ThreadLocal<LoginUser> threadLocal = new ThreadLocal<>();

    public static void setLoginUser(LoginUser loginUser) {
        threadLocal.set(loginUser);
    }

    public static LoginUser getLoginUser() {
        return threadLocal.get();
    }

    public static void clear() {
        threadLocal.remove();
    }
}
