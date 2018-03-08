package cn.qianying.graduaction.controller;

import cn.qianying.graduaction.service.VideoAuthorService;
import cn.qianying.graduaction.util.JsonMessage;
import cn.qianying.graduaction.vo.AuthorTypeDistributeVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller("videoAuthorController")
@RequestMapping(value = "/video_author")
public class VideoAuthorController {

    @Resource(name = "videoAuthorServiceImpl")
    private VideoAuthorService videoAuthorService;

    @RequestMapping(value = "/typeDistributeCensus", method = RequestMethod.GET)
    public
    @ResponseBody
    Object typeDistributeCensus() {
        List<AuthorTypeDistributeVo> vos = videoAuthorService.authorTypeDistruteCensus();
        System.out.println(vos);
        return JsonMessage.success("data", vos);
    }
}
