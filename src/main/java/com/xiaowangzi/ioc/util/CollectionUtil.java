package com.xiaowangzi.ioc.util;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class CollectionUtil {
    public static final List EMPTY_LIST = Collections.emptyList();

    private CollectionUtil(){
    }

    public static boolean isEmpty(Collection collection) {
        return null == collection || collection.isEmpty();
    }

    public static boolean isNotEmpty(Collection collection) {
        return !isEmpty(collection);
    }
}
