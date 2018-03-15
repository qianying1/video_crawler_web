package cn.qianying.graduaction.service.impl;

import cn.qianying.graduaction.dao.mapper.VideoAuthorMapper;
import cn.qianying.graduaction.service.VideoAuthorService;
import cn.qianying.graduaction.vo.AuthorTypeDistributeVo;
import cn.qianying.graduaction.vo.VideoAuthorSexRateCensusVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 视频作者服务
 */
@Service("videoAuthorServiceImpl")
public class VideoAuthorServiceImpl implements VideoAuthorService {

    @Resource(name = "videoAuthorMapper")
    private VideoAuthorMapper mapper;

    /**
     * 视频作者类型分布信息统计
     *
     * @return
     */
    public List<AuthorTypeDistributeVo> authorTypeDistruteCensus() {
        try {
            return mapper.authorTypeDistruteCensus();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    /**
     * 视频作者性别比例分布统计
     *
     * @return
     */
    public List<VideoAuthorSexRateCensusVo> videoAuthorSexRateCensus() {
        try{
            return mapper.videoAuthorSexRateCensus();
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
