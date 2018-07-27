package yangy_coder.service0.controller;

import org.apache.commons.lang.time.FastDateFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class Service0Controller {

    @RequestMapping(method = RequestMethod.GET, path = "/test/{value}")
    String test(@PathVariable(value = "value") String value) {
        System.out.println(value);
        return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.sss").format(new Date());
    }
}
