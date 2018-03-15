package cn.qianying.graduaction.controller;

import cn.qianying.graduaction.service.VideoTypeService;
import cn.qianying.graduaction.util.JsonMessage;
import cn.qianying.graduaction.vo.TypeVideoRateDistributeVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller("videoTypeController")
@RequestMapping(value = "/video_type",produces = "text/html;charset=utf-8")
public class VideoTypeController {

    @Resource(name="videoTypeServiceImpl")
    private VideoTypeService videoTypeService;
    /**
     * 类型视频占比
     *
     * @return
     */
    @RequestMapping(value = "/typeVideRateCensus",method = RequestMethod.GET)
    public @ResponseBody Object typeVideRateCensus(){
        List<TypeVideoRateDistributeVo> vos=videoTypeService.typeVideRateCensus();
        System.out.println(vos);
        return JsonMessage.success("data",vos);
    }

}
