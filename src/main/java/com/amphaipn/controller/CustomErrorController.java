package com.amphaipn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by A on 3/31/2017.
 */
@Controller
public class CustomErrorController implements ErrorController{
    private static final String ERROR_PATH = "/error";
    private static final String ERROR_TEMPLATE = "customError";

    private final ErrorAttributes errorAttributes;
    @Autowired
    public CustomErrorController(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }
    @RequestMapping(ERROR_PATH)
    public String error(Model model, HttpServletRequest request){
        return "";
    }
    /**
     * Returns the path of the error page.
     *
     * @return the error path
     */
    @Override
    public String getErrorPath() {
        return null;
    }
}
