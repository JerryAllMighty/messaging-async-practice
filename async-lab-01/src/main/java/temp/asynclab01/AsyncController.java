package temp.asynclab01;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/async")
@RequiredArgsConstructor
@Slf4j
public class AsyncController {
    private final AsyncService asyncService;

//    목표: @EnableAsync + @Async가 실제로 별도 스레드에서 도는지 확인한다.
    @GetMapping("/completable")
    void returnSomething() throws InterruptedException {
        log.info("before Async Thread Name : " + Thread.currentThread().getName());
        asyncService.returnSomething().thenAccept(
                result -> log.info("return of async | {}", result)
        );
        log.info("after Async");
    }
}
