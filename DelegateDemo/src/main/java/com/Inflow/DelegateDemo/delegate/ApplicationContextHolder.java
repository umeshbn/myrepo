//package com.Inflow.DelegateDemo.delegate;
//
//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ApplicationContextHolder implements ApplicationContextAware {
//
//    private static ApplicationContext applicationContext;
//
//    @Override
//    public void setApplicationContext(ApplicationContext context) throws BeansException {
//        System.out.println("Hello setApplicationContext");
//        applicationContext = context;
//        System.out.println("ApplicationContext set: " + applicationContext.getDisplayName());
//    }
//
//    public static ApplicationContext getContext() {
//        return applicationContext;
//    }
//}
