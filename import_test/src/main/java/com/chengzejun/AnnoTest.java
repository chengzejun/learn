package com.chengzejun;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableUserBean
public class AnnoTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AnnoTest.class);
        User user=ac.getBean(User.class);
        System.out.println(user);
    }
}
