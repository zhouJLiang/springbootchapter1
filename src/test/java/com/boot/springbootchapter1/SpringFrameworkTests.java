package com.boot.springbootchapter1;

import com.springLearn.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertEquals;

public class SpringFrameworkTests {

    @Test
    public  void testBean(){
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application.xml"));
        MyTestBean bean  = (MyTestBean) beanFactory.getBean("myTestBean");
        System.out.println(bean.getTestString());
        assertEquals("caocao",bean.getTestString());
    }
}
