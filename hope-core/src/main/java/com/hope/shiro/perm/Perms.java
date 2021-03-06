package com.hope.shiro.perm;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Component;

/**
 * js调用 thymeleaf 实现按钮权限
 *
 * @program:hope-boot
 * @author:aodeng
 * @blog:低调小熊猫(https://aodeng.cc)
 * @微信公众号:低调小熊猫
 * @create:2018-10-29 13:59
 **/
@Component("perms")
public class Perms {
    //代码参考：https://gitee.com/supperzh/zb-shiro/blob/master/src/main/java/com/nbclass/shiro/PermsService.java
    public boolean hasPerm(String permission) {
        return SecurityUtils.getSubject().isPermitted(permission);
    }
}
