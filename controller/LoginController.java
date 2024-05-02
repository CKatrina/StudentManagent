package com.management.controller;

import com.management.Parametric.User;
import com.management.service.services.LoginLogService;
import com.management.service.services.UserService;
import com.management.utils.EnumCode;
import com.management.utils.ResultUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "user")
public class LoginController extends BaseController{

    @Autowired
    private UserService userService;

    @Autowired
    private LoginLogService loginLogService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Object login(String name,String pass, HttpSession session, HttpServletRequest request , boolean first_Flag) {
        User user = new User();
        user.setUsername(name);
        user.setPassword(pass);
        user.setFirstlogin(first_Flag);
        return userService.login(user, session, request);
    }

    @RequestMapping(value = "/loginOut",method = RequestMethod.GET)
    public Object logout() {
        try {
            Subject subject = SecurityUtils.getSubject();
            subject.logout();
            return ResultUtil.result(EnumCode.OK.getValue(), "successfully exit");
        } catch (Exception e) {
            return "/login";
        }
    }
}
