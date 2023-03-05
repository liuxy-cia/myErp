package com.jsh.erp.service.systemConfig;

import com.jsh.erp.service.ResourceInfo;

import java.lang.annotation.*;

/**
 * @author liuxinyu  2018-10-7 15:26:27
 */
@ResourceInfo(value = "systemConfig", type = 1574002437)
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SystemConfigResource {
}
