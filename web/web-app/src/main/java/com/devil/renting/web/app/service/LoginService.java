package com.devil.renting.web.app.service;

import com.devil.renting.web.app.vo.user.LoginVo;
import com.devil.renting.web.app.vo.user.UserInfoVo;

public interface LoginService {
    void getSMSCode(String phone);

    String login(LoginVo loginVo);

    UserInfoVo getUserInfoById(Long userId);
}
