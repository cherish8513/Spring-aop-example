package hello.aop.member.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 이 어노테이션을 포인트 컷의 대상으로 지정해서 이 어노테이션이 붙은 클래스는 포인트컷의 대상이 된다.
@Target(ElementType.TYPE) // 어노테이션에는 Target이 필요한데 Class에는 ElementType.TYPE을 붙인다.
@Retention(RetentionPolicy.RUNTIME) // 실제 실행할 때 까지 어노테이션이 살아있는다.
public @interface ClassAop { // @Interface를 붙이면 어노테이션으로 만들어준다.
}
