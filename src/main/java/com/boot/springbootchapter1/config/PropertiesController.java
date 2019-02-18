package com.boot.springbootchapter1.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cfg")
@RestController
public class PropertiesController {

    public static final Logger logger = LoggerFactory.getLogger(PropertiesController.class);

    private final MyProperties myProperties;

    private final MyProperties1 myProperties1;
    public PropertiesController(MyProperties myProperties,MyProperties1 myProperties1){
        this.myProperties = myProperties;
        this.myProperties1 = myProperties1;
    }

    @GetMapping("/c1")
    public MyProperties getMyProperties() {

        logger.info("++++++++++++++++++++++");
        logger.info(myProperties.toString());
        logger.info("++++++++++++++++++++++");

        return myProperties;
    }

    @GetMapping("/c2")
    public MyProperties1 getMyProperties2() {

        logger.info("222222222");
        logger.info(myProperties1.toString());
        logger.info("++++++++++++++++++++++");

        return myProperties1;
    }
}
