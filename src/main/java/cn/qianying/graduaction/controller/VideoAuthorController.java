package cn.qianying.graduaction.controller;

import cn.qianying.graduaction.service.VideoAuthorService;
import cn.qianying.graduaction.util.JsonMessage;
import cn.qianying.graduaction.vo.AuthorTypeDistributeVo;
import cn.qianying.graduaction.vo.VideoAuthorSexRateCensusVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller("videoAuthorController")
@RequestMapping(value = "/video_author", produces = "text/html;charset=UTF-8;")
public class VideoAuthorController {

    @Resource(name = "videoAuthorServiceImpl")
    private VideoAuthorService videoAuthorService;

    /**
     * 视频作者类型分布统计
     *
     * @return
     */
    @RequestMapping(value = "/typeDistributeCensus", method = RequestMethod.GET)
    public
    @ResponseBody
    Object typeDistributeCensus() {
        List<AuthorTypeDistributeVo> vos = videoAuthorService.authorTypeDistruteCensus();
        System.out.println("typeDistributeCensus: ");
        System.out.println(vos);
        return JsonMessage.success("data", vos);
    }

    /**
     * 视频作者性别比例分布统计
     *
     * @return
     */
    @RequestMapping(value = "/videoAuthorSexRateCensus", method = RequestMethod.GET)
    public
    @ResponseBody
    Object videoAuthorSexRateCensus() {
        List<VideoAuthorSexRateCensusVo> vos=videoAuthorService.videoAuthorSexRateCensus();
        System.out.println("videoAuthorSexRateCensus: ");
        System.out.println(vos);
        return JsonMessage.success("data",vos);
    }
}
