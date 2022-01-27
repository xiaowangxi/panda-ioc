package com.xiaowangzi.ioc.context;

import com.github.houbb.json.bs.JsonBs;
import com.xiaowangzi.ioc.factory.impl.DefaultBeanFactory;
import com.xiaowangzi.ioc.model.BeanDefinition;
import com.xiaowangzi.ioc.model.impl.DefaultBeanDefinition;
import com.xiaowangzi.ioc.util.CollectionUtil;
import com.xiaowangzi.ioc.util.FileUtil;

import java.io.InputStream;
import java.util.List;

/**
 * JSON 应用上下文
 */
public class JsonApplicationContext extends DefaultBeanFactory {
    /**
     * 文件名称
     */
    private final String fileName;

    public JsonApplicationContext(String fileName) {
        this.fileName = fileName;
        // 初始化
        this.init();
    }

    /**
     * 初始化配置
     */
    private void init() {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        final String jsonConfig = FileUtil.getFileContent(inputStream);
        List<DefaultBeanDefinition> beanDefinitions = JsonBs.deserializeArray(jsonConfig, DefaultBeanDefinition.class);
        if (CollectionUtil.isNotEmpty(beanDefinitions)) {
            for (BeanDefinition beanDefinition : beanDefinitions) {
                super.registerBeanDefinition(beanDefinition.getName(), beanDefinition);
            }
        }
    }
}
