package cn.qianying.graduaction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by qianhaibin on 2018/3/7.
 */
@Controller("videoController")
@RequestMapping(value = "/video")
public class VideoController {
    /**
     * 错误页面
     */
    private final String ERROR_PAGE = "error";
    /**
     * 页面根目录
     */
    private final String CENSUS_PAGE = "census/";

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
     * 视频人气统计
     *
     * @return
     */
    @RequestMapping(value = "/videoPopularityCensus", method = RequestMethod.GET)
    public String videoPopularityCensus() {
        return "census/video_popularity_census";
    }

}
