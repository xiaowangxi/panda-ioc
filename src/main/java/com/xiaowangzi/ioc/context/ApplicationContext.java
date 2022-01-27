package com.xiaowangzi.ioc.context;

import com.xiaowangzi.ioc.factory.ListableBeanFactory;

/**
 * 应用上下文接口
 */
public interface ApplicationContext extends ListableBeanFactory {
    /**
     * 获取应用名称
     *
     * @return 应用名称
     */
    String getApplicationName();
}
