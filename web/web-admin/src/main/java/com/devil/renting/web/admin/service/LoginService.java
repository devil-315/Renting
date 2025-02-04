package com.devil.renting.web.admin.service;


import com.devil.renting.web.admin.vo.login.CaptchaVo;
import com.devil.renting.web.admin.vo.login.LoginVo;
import com.devil.renting.web.admin.vo.system.user.SystemUserInfoVo;

public interface LoginService {

    CaptchaVo getCaptcha();

    String login(LoginVo loginVo);

    SystemUserInfoVo getLoginUserInfo(Long userId);
}
