package com.example.Spring;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@RestController
public class test {

    
    public class SpringBootTutorialApplication {

        public static void main(String[] args) {
            test.run(SpringBootTutorialApplication.class, args);
        }

        @GetMapping("/hell")
        public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
            return String.format("Hello %s!", name);
        }

    }

    private static void run(Class<SpringBootTutorialApplication> springBootTutorialApplicationClass, String[] args) {
    }
}
