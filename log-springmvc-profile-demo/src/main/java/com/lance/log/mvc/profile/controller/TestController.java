package com.lance.log.mvc.profile.controller;

import com.lance.log.mvc.profile.property.DataPropertyReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private DataPropertyReader dataPropertyReader;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String helloWorld() {
        logger.info("testspringmvcmultilogback");
        logger.info("dataPropertyReader: {}", dataPropertyReader.toString());
        return "test";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public ModelAndView helloWorld2() {
        return new ModelAndView("test");
    }

}