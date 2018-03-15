package cn.qianying.graduaction.service.impl;

import cn.qianying.graduaction.dao.mapper.StyleMapper;
import cn.qianying.graduaction.service.VideoTypeService;
import cn.qianying.graduaction.vo.TypeVideoRateDistributeVo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 视频类型服务
 */
@Service(value="videoTypeServiceImpl")
public class VideoTypeServiceImpl implements VideoTypeService {

    @Resource(name="styleMapper")
    private StyleMapper mapper;
    /**
     * 类型视频占比
     *
     * @return
     */
    public List<TypeVideoRateDistributeVo> typeVideRateCensus(){
        try{
            return mapper.typeVideRateCensus();
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
