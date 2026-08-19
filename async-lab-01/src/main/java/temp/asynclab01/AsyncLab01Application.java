package temp.asynclab01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class AsyncLab01Application {

    public static void main(String[] args) {
        SpringApplication.run(AsyncLab01Application.class, args);
    }

}
