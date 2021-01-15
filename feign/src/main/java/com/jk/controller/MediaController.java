package com.jk.controller;

import com.jk.service.PerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MediaController {

    @Autowired
    private PerService perService;

}
