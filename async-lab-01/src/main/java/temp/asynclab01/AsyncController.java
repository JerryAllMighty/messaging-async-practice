package temp.asynclab01;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.Future;

@RequiredArgsConstructor
public class AsyncController {
    private final AsyncService asyncService;

    @Async
    void doSomething() {
        // this will be run asynchronously
    }

    @Async
    void doSomething(String s) {
        // this will be run asynchronously
    }

    @Async
    Future<String> returnSomething(int i) {
        // this will be run asynchronously
    }
}
