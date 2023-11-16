package com.vn.joytrav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/", "/JoyTrav"})
public class HomeController {

    @RequestMapping(value =  "/booking")
    public String bookingT() {
        return "joyTrav/fragments/header/Booking";
    }
}
