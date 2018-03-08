package cn.qianying.graduaction.service.impl;

import cn.qianying.graduaction.dao.mapper.VideoAuthorMapper;
import cn.qianying.graduaction.service.VideoAuthorService;
import cn.qianying.graduaction.vo.AuthorTypeDistributeVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    public List<AuthorTypeDistributeVo> authorTypeDistruteCensus(){
        return mapper.authorTypeDistruteCensus();
    }
}
