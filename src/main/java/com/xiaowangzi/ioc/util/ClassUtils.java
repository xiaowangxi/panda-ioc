package com.xiaowangzi.ioc.util;

import com.xiaowangzi.ioc.exception.IocRuntimeException;

public class ClassUtils {
    /**
     * 获取当前的 class loader
     * @return 当前的 class loader
     */
    public static ClassLoader currentClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }

    /**
     * 获取类信息
     */
    public static Class getClass(final String className) {
        ArgUtil.notEmpty(className, "className");

        try {
            return currentClassLoader().loadClass(className);
        } catch (ClassNotFoundException e) {
            throw new IocRuntimeException(e);
        }
    }

    /**
     * 直接根据 class 无参构造器创建实例
     * @param clazz 类信息
     * @return 实例
     */
    public static Object newInstance(final Class clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IocRuntimeException(e);
        }
    }
}
