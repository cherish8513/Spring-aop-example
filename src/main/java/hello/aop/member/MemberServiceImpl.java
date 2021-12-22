package hello.aop.member;

import hello.aop.member.annotation.ClassAop;
import hello.aop.member.annotation.MethodAop;
import org.springframework.stereotype.Component;

@ClassAop // 만들었던 어노테이션
@Component // 빈 등록
public class MemberServiceImpl implements MemberService{

    @Override
    @MethodAop("test value")
    public String hello(String param) {
        return  "ok";
    }

    public String internal(String param){
        return "ok";
    }
}
