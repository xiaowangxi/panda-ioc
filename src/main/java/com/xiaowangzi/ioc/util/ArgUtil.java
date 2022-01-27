package com.xiaowangzi.ioc.util;

public final class ArgUtil {
    private ArgUtil() {
    }


    public static void notEmpty(String string, String name) {
        if (StringUtil.isEmpty(string)) {
            throw new IllegalArgumentException(name + " can not be null!");
        }
    }
}
