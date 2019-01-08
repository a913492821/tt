package com.hang.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class managerIndexController {
    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public String one(@PathVariable String page) {
        return page;
    }

    @RequestMapping(value = "/pages/{page}", method = RequestMethod.GET)
    public String two(@PathVariable String page) {
        return "pages/" + page;
    }

    @RequestMapping(value = "/pages/{page}/{page2}", method = RequestMethod.GET)
    public String three(@PathVariable String page,@PathVariable String page2) {
        return "pages/" + page + "/" + page2;
    }
}
