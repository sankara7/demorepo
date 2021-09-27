package com.wakaleo.gameoflife.webtests.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 /**
 * Wakaleo Consulting - John Ferguson Smart
 * Game of life, demonstration application for Jenkins: The Definitive Guide
 *
 * HomePageController.java
 * Controller to navigate to the main page
 */
@Controller
public class HomePageController {
    
	 private static Logger log = LoggerFactory.getLogger(GameController.class);
    
    @RequestMapping("/")
    public ModelAndView index() {
        
        log.info("----------------index started---------------");
        return new ModelAndView("home");
    }

	// Clicking the "home" text loads the main page
    @RequestMapping("/home")
    public ModelAndView home() {
        log.info("----------------home started---------------");
        return new ModelAndView("home");
    }
}
