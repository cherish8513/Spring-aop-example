package hello.aop.example;

import hello.aop.example.annotation.Trace;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExamService {

    private final ExamRepository repository;

    @Trace
    public void request(String itemId){
        repository.save(itemId);
    }
}
