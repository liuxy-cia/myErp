package com.jsh.erp.service.unit;

import com.jsh.erp.service.ResourceInfo;

import java.lang.annotation.*;

/**
 * @author liuxinyu  2018-10-7 15:26:27
 */
@ResourceInfo(value = "unit", type = 1574002451)
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UnitResource {
}
