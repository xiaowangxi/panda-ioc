package com.xiaowangzi.ioc.util;

public final class StringUtil {
    public static final String EMPTY = "";
    public static final String BLANK = " ";

    private StringUtil() {
    }

    public static boolean isEmpty(String string) {
        return null == string || "".equals(string);
    }

    public static String trim(String original) {
        return isBlank(original) ? original : original.trim();
    }

    public static boolean isBlank(String str) {
        int strLen;
        if (str != null && (strLen = str.length()) != 0) {
            for (int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    public static String bytesToString(byte[] bytes) {
        if (null == bytes || bytes.length <= 0) {
            return null;
        } else {
            return new String(bytes);
        }
    }
}
