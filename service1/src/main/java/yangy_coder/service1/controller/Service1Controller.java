package yangy_coder.service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import yangy_coder.service1.client.Service0Client;

@RestController
public class Service1Controller {

    @Autowired
    Service0Client service0Client;

    @RequestMapping(method = RequestMethod.GET, path="/test/{value}")
    String test(@PathVariable String value) {
        return service0Client.test(value);
    }
}
