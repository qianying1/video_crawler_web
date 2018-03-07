package cn.qianying.graduaction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("videoTypeController")
@RequestMapping(value = "/video_type")
public class VideoTypeController {

    /**
     * 视频类型统计
     *
     * @return
     */
    @RequestMapping(value = "/type_census",method = RequestMethod.GET)
    public String videoTypeCensus(){
        return "";
    }
}
