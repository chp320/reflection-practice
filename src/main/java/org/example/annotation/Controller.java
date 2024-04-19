package org.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 해당 애노테이션을 어디에 붙힐 것인가??
@Target({ElementType.TYPE})     // 대상은 '클래스' 혹은 '인터페이스'
@Retention(RetentionPolicy.RUNTIME)     // 유지 기간: 런타임까지
public @interface Controller {
}
