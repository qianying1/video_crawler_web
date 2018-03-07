package cn.qianying.graduaction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by qianhaibin on 2018/3/7.
 */
@Controller("videoController")
@RequestMapping(value = "/video")
public class VideoController {

    @RequestMapping(value = "/videoAnalise",method = RequestMethod.GET)
    public String videoAnalise(){
        System.out.println("used!!!!!!!!!!!");
        return "index";
    }
}
