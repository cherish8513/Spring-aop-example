package hello.aop.internalcall.aop;

import hello.aop.internalcall.CallServiceV0;
import hello.aop.internalcall.CallServiceV2;
import hello.aop.internalcall.CallServiceV3;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;


@Slf4j
@Import(CallLogAspect.class)
@SpringBootTest
class CallLogAspectTest {

    @Autowired
    CallServiceV0 service;

    @Autowired
    CallServiceV2 service2;

    @Autowired
    CallServiceV3 service3;

    @Test
    public void test() throws Exception{
        service.external();
    }

    @Test
    public void testExternal() throws Exception{
        log.info("class = {}", service2.getClass());
        service2.external();
    }

    @Test
    public void 구조변경Test() throws Exception{
        service3.external();
    }

}