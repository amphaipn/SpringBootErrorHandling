package com.amphaipn.controller;

import com.amphaipn.domain.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by A on 3/31/2017.
 */
@Controller
@RequestMapping("/posts")
public class PostController {
    private static final Logger logger = LoggerFactory.getLogger(PostController.class);
    @SuppressWarnings("unused")
    @RequestMapping("/get/{slug}")
    public String getPost(@PathVariable(value = "slug") String slug) throws Exception{
        Post post = null;
        logger.debug("GetPost called with slug" + slug);
        if (post == null) throw new Exception("We couldn't find the post with slug " + slug);
        return "index";
    }
}
