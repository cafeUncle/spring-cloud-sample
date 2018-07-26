package yangy_coder.service0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Service0 {

    @GetMapping("/service0")
    public String service0() {
        return "service0";
    }

    public static void main(String[] args) {
        SpringApplication.run(Service0.class, args);
    }
}
