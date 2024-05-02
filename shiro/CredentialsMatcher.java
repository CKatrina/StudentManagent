package com.management.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

public class CredentialsMatcher extends SimpleCredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        UsernamePasswordToken utoken=(UsernamePasswordToken) token;
        //Get the password entered by the user: (you can use the salt (salt) way to check)
        String inPassword = new String(utoken.getPassword());
        //Get the password in the database
        String dbPassword=(String) info.getCredentials();
        //Perform password matching
        return this.equals(inPassword, dbPassword);
    }

}
