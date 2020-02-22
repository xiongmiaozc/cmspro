package com.cms.portal.security.filter;

import lombok.Getter;
import lombok.Setter;
import org.apache.shiro.web.filter.authc.UserFilter;

/**
 * 个人微信: 15254124776
 * 个人qq:  2301887641
 *
 * @date: 2020/02/22/17:29
 */
@Getter
@Setter
public class CmsUserFilter extends UserFilter {
    private String  adminLoginUrl;
    private String adminPrefix;

}
