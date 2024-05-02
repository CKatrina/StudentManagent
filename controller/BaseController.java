package com.management.controller;

import com.management.Parametric.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


public class BaseController {


    /**
     * Get request
     */
    protected HttpServletRequest getRequest() {

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes())
                .getRequest();
        return request;

    }

    /**
     * Get user name
     * @return
     */
    protected String getUserName() {

        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        if (null == user) {
            return null;
        }
        return null == user.getUsername() ? null : user.getUsername();

    }

    /**
     * Get username id
     * @return
     */
    protected String getUserId() {

        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        if (null == user) {
            return null;
        }
        return null == user.getId() ? null : user.getId();

    }

    /**
     * Get character id
     * @return
     */
    protected String getRoleId() {

        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        if (null == user) {
            return null;
        }
        return null == user.getRoleId() ? null : user.getRoleId();

    }

    /**
     * Get Character Name
     * @return
     */
    protected String getRoleName() {

        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        if (null == user) {
            return null;
        }
        return null == user.getRoleName() ? null : user.getRoleName();

    }

}
