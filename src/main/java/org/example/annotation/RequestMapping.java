package org.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})         // 애너테이션 적용 가능한 대상은 클래스/인터페이스 등에 가능한 'TYPE', 메서드인 'METHOD'
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
    // GET 요청인 경우 url path에 값을 넣을 수 있기 때문에 값을 저장하기 위한 변수
    String value() default "";

    // GET 요청인지 POST 요청인지에 따른 method 관리 (GET/POST 등이 여러개 될 수 있기 때문에 배열로 지정)
    RequestMethod[] method() default {};
}
