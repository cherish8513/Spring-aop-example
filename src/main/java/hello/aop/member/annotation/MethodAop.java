package hello.aop.member.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 메서드에 붙이는 Target
@Retention(RetentionPolicy.RUNTIME) // 어노테이션의 라이프사이클 관리
public @interface MethodAop {
    String value(); // 값을 넣을 공간
}
