package com.management.config;

import com.management.shiro.AuthRealm;
import com.management.shiro.CredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    /**
     * Print Log
     */
    private final static Logger log = LoggerFactory.getLogger(ShiroConfig.class);

    /**
     * ShiroFilterFactoryBean handles intercepting resource files.
     * Note: A separate ShiroFilterFactoryBean configuration is or reports an error, because it is necessary to inject: SecurityManager when
     * ShiroFilterFactoryBean needs to be injected when it is initialised: SecurityManager
     *
     *Filter Chain definition description 1, a URL can be configured multiple Filter, using comma separated 2, when setting multiple filters, all the validation through, to be considered as through the
     *3, some filters can specify parameters, such as perms, roles
     *
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {

        log.info("====================== shrio interceptor factory injection started =====================");

        ShiroFilterFactoryBean sffb = new ShiroFilterFactoryBean();
        // The SecurityManager must be set.
        sffb.setSecurityManager(securityManager);
        // login page
        sffb.setLoginUrl("/user/login");

        // Unauthorised screen;
        sffb.setUnauthorizedUrl("/login");
        // interceptor
        Map<String,String> filterMap = new LinkedHashMap<>();
        // Can be accessed anonymously
        filterMap.put("/user/login", "anon");
        filterMap.put("/user/logout", "anon");
        filterMap.put("/user/uploadHander", "anon");
        // Authentication required for access
        filterMap.put("/*", "authc");
        filterMap.put("/**", "authc");
        filterMap.put("/*.*", "authc");
        // Binding Interceptor
        sffb.setFilterChainDefinitionMap(filterMap);

        log.info("====================== shrio interceptor factory injection succeeded =====================");
        return sffb;
    }

    /**
     * @desc: Configuring core security service management
     *
     * {@code @date:} 2024/4/19
     */
    @Bean
    public SecurityManager securityManager() {
        log.info("========================shiro is loaded======================");
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(authRealm());
        return securityManager;
    }

    /**
     *  Configure a custom permission logger
     *
     * @return
     */
    @Bean
    public AuthRealm authRealm() {

        AuthRealm authRealm = new AuthRealm();
        authRealm.setCredentialsMatcher(credentialsMatcher());
        return authRealm;
    }

    //Configure a customised password comparator
    @Bean
    public CredentialsMatcher credentialsMatcher() {
        return new CredentialsMatcher();
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor() {
        AuthorizationAttributeSourceAdvisor advisor=new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager());
        return advisor;
    }
}

