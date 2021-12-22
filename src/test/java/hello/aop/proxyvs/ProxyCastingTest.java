package hello.aop.proxyvs;

import hello.aop.member.MemberService;
import hello.aop.member.MemberServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;

@Slf4j
public class ProxyCastingTest {

    @Test
    public void jdkProxy() throws Exception{
        MemberServiceImpl target = new MemberServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        proxyFactory.setProxyTargetClass(false); // JDK 동적 프록시

        MemberService memberServiceProxy = (MemberService) proxyFactory.getProxy();

        // 구체 타입으로 캐스팅 불가능
        Assertions.assertThrows(ClassCastException.class, () ->{
            MemberServiceImpl castingMemberService = (MemberServiceImpl) memberServiceProxy;
        });
    }

    @Test
    public void cglibProxy() throws Exception{
        MemberServiceImpl target = new MemberServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        proxyFactory.setProxyTargetClass(true); // cglib

        MemberService memberServiceProxy = (MemberService) proxyFactory.getProxy();

        // 구체 클래스 캐스팅 가능
        MemberServiceImpl castingMemberService = (MemberServiceImpl) memberServiceProxy;
    }
}
