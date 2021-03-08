package com.pk.test;

import java.lang.annotation.*;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyLog {
    /** 操作事件     */
    String operation () default "";

    /** 日志类型 */
    int type ();
}