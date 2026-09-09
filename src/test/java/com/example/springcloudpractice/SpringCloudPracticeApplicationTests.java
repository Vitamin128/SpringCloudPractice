package com.example.springcloudpractice;

import com.example.springcloudpractice.impl.student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.cloud.nacos.discovery.enabled=false")
class SpringCloudPracticeApplicationTests {

    @Test
    void contextLoads() {
        student s1=new student();

    }

}
