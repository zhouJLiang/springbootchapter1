package com.springLearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringFramework {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("application.xml");
    }
}
