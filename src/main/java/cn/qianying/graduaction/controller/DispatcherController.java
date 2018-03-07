package cn.qianying.graduaction.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 页面分发器
 */
@Controller("dispatcherController")
@RequestMapping("/go/{keyword}")
public class DispatcherController {

    @RequestMapping(value = "/video/videoPopularityCensus", method = RequestMethod.GET)
    public String videoPopularityCensus(@PathVariable("keyword") String key) {
        if (StringUtils.isBlank(key.trim().replace(" ", ""))) {

        }
        return "";
    }

    /**
     * 主页
     *
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
