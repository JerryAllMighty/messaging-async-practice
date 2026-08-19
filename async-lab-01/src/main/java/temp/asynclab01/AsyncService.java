package temp.asynclab01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class AsyncService {

    @Async
    CompletableFuture<String> returnSomething() throws InterruptedException {
        Thread.sleep(1000L);
        log.info("service Thread Name : " + Thread.currentThread().getName());
        return CompletableFuture.completedFuture("service done, return");
    }
}
