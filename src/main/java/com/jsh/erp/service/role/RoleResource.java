package com.jsh.erp.service.role;

import com.jsh.erp.service.ResourceInfo;

import java.lang.annotation.*;

/**
 * @author liuxinyu  2018-10-7 15:26:27
 */
@ResourceInfo(value = "role", type = 1574002414)
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RoleResource {
}
