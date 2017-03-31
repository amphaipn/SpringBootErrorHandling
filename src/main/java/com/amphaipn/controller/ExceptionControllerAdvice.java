package com.amphaipn.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by A on 3/31/2017.
 */
@ControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(Exception.class)
    public String exception(Exception exception, Model model) {
        model.addAttribute("exception", exception);
        return "globalControllerHandler";
    }
}
