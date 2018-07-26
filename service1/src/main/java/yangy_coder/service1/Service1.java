package yangy_coder.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "yangy_coder")
@EnableEurekaClient
@RestController
@EnableFeignClients
@EnableWebMvc
public class Service1 {

    @GetMapping("/service1")
    public String service1() {
        return "service1";
    }

    public static void main(String[] args) {
        SpringApplication.run(Service1.class, args);
    }
}
