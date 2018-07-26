package yangy_coder.service1.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 创建FeignClient,值是service0的spring.application.name
 */
@FeignClient("service0")
public interface Service0Client {

    /**
     * 声明service0的test方法的接口即可，不需要实现，只需要提供一个方法签名一致的接口方法即可，其它由框架匹配
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, path = "/test/{value}")
    String test(@PathVariable String value);

}
