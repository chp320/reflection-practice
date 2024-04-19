package org.example;

import org.example.annotation.Controller;
import org.example.annotation.Service;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * 실습 목표
 * - @Controller 애노테이션이 설정돼 있는 모든 클래스를 찾아서 출력한다.
 */
public class ReflectionTest {

    private static final Logger logger = LoggerFactory.getLogger(ReflectionTest.class);
    @Test
    void controllerScan() {
        Reflections reflections = new Reflections("org.example");

        Set<Class<?>> beans = new HashSet<>();
        beans.addAll(reflections.getTypesAnnotatedWith(Controller.class));  // reflections(org.example 패키지에서 찾은 모든 클래스)에서 'Controller' 애너테이션이 붙은 모든 클래스를 찾아서 hash set 에 담음 !!
        beans.addAll(reflections.getTypesAnnotatedWith(Service.class));
        logger.debug("beans: [{}]", beans);
    }
}
