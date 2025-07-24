package com.example.contextdemo.demo;

import com.example.contextdemo.framework.DemoSection;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ContextInfoService implements DemoSection, ApplicationContextAware, BeanNameAware {

    private ApplicationContext context;
    private String beanName;

    @Override
    public void run() {
        System.out.println("\n=== Running: ContextInfoService ===");
        System.out.println("[ContextInfoService] Bean name hiện tại: " + beanName);

        String[] allBeans = context.getBeanDefinitionNames();
        System.out.println("[ContextInfoService] Số lượng bean trong context: " + allBeans.length);

        System.out.println("[ContextInfoService] Lấy thử một bean khác từ context (vd: LoggerService)");
        Object logger = context.getBean("loggerService");
        System.out.println("→ Bean loggerService có class: " + logger.getClass().getSimpleName());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
}
