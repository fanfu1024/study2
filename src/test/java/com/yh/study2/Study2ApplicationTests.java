package com.yh.study2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class Study2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.yh.study2");
        Student student = (Student) annotationConfigApplicationContext.getBean("student");
        System.out.println(student);
    }
}
