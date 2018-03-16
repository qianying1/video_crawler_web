package cn.qianying.graduaction.service.impl;

import cn.qianying.graduaction.dao.mapper.StyleMapper;
import cn.qianying.graduaction.service.VideoTypeService;
import cn.qianying.graduaction.vo.TypeVideoRateDistributeVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 视频类型服务
 */
@Service(value="videoTypeServiceImpl")
public class VideoTypeServiceImpl implements VideoTypeService {
    private static Logger logger= LoggerFactory.getLogger(VideoTypeServiceImpl.class);
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
            logger.error("查询类型视频数据失败",e);
            return new ArrayList<>();
        }
    }
}
