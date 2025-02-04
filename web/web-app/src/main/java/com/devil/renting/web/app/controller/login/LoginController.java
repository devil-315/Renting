package com.devil.renting.web.app.controller.login;


import com.devil.renting.common.login.LoginUserHolder;
import com.devil.renting.common.result.Result;
import com.devil.renting.web.app.service.LoginService;
import com.devil.renting.web.app.vo.user.LoginVo;
import com.devil.renting.web.app.vo.user.UserInfoVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "登录管理")
@RestController
@RequestMapping("/app/")
public class LoginController {

    @Autowired
    private LoginService service;
    @GetMapping("login/getCode")
    @Operation(summary = "获取短信验证码")
    public Result getCode(@RequestParam String phone) {
        service.getSMSCode(phone);
        return Result.ok();
    }

    @PostMapping("login")
    @Operation(summary = "登录")
    public Result<String> login(@RequestBody LoginVo loginVo) {
        String token = service.login(loginVo);
        return Result.ok(token);
    }

    @GetMapping("info")
    @Operation(summary = "获取登录用户信息")
    public Result<UserInfoVo> info() {
        Long userId = LoginUserHolder.getLoginUser().getUserId();
        UserInfoVo info = service.getUserInfoById(userId);
        return Result.ok(info);
    }
}

