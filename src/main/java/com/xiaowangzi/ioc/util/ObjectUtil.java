package com.xiaowangzi.ioc.util;

public final class ObjectUtil {
    private ObjectUtil() {
    }

    public static boolean isNull(Object object) {
        return null == object;
    }

    public static boolean isNotNull(Object object) {
        return !isNull(object);
    }
}
