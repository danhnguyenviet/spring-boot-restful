package com.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Danh on 4/6/2017.
 */
@RestController
public class SumController {

    @RequestMapping("/sum")
    public Sum greeting(@RequestParam(value="a", defaultValue="1") Integer a,
                        @RequestParam(value="b", defaultValue="1") Integer b) {
        return new Sum(a, b, a + b);
    }
}
