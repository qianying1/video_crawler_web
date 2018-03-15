package cn.qianying.graduaction.controller;

import cn.qianying.graduaction.service.FictionService;
import cn.qianying.graduaction.util.JsonMessage;
import cn.qianying.graduaction.vo.FictionAndVideoDistributeCensusVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 小说
 */
@Controller("fictionController")
@RequestMapping(value = "/fiction", produces = "text/html;charset=utf-8")
public class FictionController {

    @Resource(name="fictionServiceImpl")
    private FictionService fictionSerive;
    /**
     * 小说和视频分布统计
     *
     * @return
     */
    @RequestMapping(value = "/fictionAndVideoDistributeCensus", method = RequestMethod.GET)
    public
    @ResponseBody
    Object fictionAndVideoDistributeCensus() {
        List<FictionAndVideoDistributeCensusVo> vos=fictionSerive.fictionAndVideoDistributeCensus();
        System.out.println("fictionAndVideoDistributeCensus: ");
        System.out.println(vos);
        return JsonMessage.success("data",vos);
    }
}
