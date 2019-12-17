package com.baeldung.um.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.baeldung.um.spring.LssoApp;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LssoApp.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class Lss2IntegrationTest {

    @Test
    public void whenLoadApplication_thenSuccess() {

    }
}
