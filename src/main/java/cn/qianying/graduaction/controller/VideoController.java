package cn.qianying.graduaction.controller;

import cn.qianying.graduaction.service.VideoService;
import cn.qianying.graduaction.util.JsonMessage;
import cn.qianying.graduaction.vo.VideoLikesCensusVo;
import cn.qianying.graduaction.vo.VideoLenDistributeCensusVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qianhaibin on 2018/3/7.
 */
@Controller("videoController")
@RequestMapping(value = "/video", produces = "text/html;charset=UTF-8;")
public class VideoController {
    /**
     * 错误页面
     */
    private final String ERROR_PAGE = "error";
    /**
     * 页面根目录
     */
    private final String CENSUS_PAGE = "census/";
    @Resource(name = "videoServiceImpl")
    private VideoService videoService;

    /**
     * rest风格请求
     *
     * @param id
     * @param username
     * @return
     */
    @RequestMapping(value = "/videoAnalise/{id}", method = RequestMethod.GET)
    public String videoAnalise(@PathVariable("id") Integer id, @PathVariable("username") String username) {
        System.out.println("username: " + username);
        System.out.println("used!!!!!!!!!!!" + id);
        return "index";
    }

    /**
     * 视频喜欢人数统计
     *
     * @return
     */
    @RequestMapping(value = "/videoLikeCensus", method = RequestMethod.GET)
    public
    @ResponseBody
    Object
    videoLikesCensus() {
        List<VideoLikesCensusVo> likesCensusVos = videoService.videoLikeCensus();
        System.out.println(likesCensusVos);
        return JsonMessage.success("data", likesCensusVos);
    }

    /**
     * 视频长度分布统计
     *
     * @return
     */
    @RequestMapping(value = "/videoLenDistributeCensus", method = RequestMethod.GET)
    public
    @ResponseBody
    Object videoLenDistributeCensus() {
        List<VideoLenDistributeCensusVo> vos = videoService.videoLenDistributeCensus();
        System.out.println(vos);
        return JsonMessage.success("data", vos);
    }

    @RequestMapping(value = "/videoLengthCensus", method = RequestMethod.GET)
    public String videoLengthCensus() {
        return "";
    }

}
