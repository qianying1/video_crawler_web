package cn.qianying.graduaction.service.impl;

import cn.qianying.graduaction.dao.mapper.VideoMapper;
import cn.qianying.graduaction.domain.vo.VideoLikesCensusVo;
import cn.qianying.graduaction.service.VideoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 视频服务
 * <p>
 * Created by qianhaibin on 2018/3/8.
 */
@Service("videoServiceImpl")
public class VideoServiceImpl implements VideoService {
    @Resource(name = "videoMapper")
    private VideoMapper mapper;

    /**
     * 获取视频喜欢人数统计列表
     *
     * @return
     */
    public List<VideoLikesCensusVo> videoLikeCensus() {
        List<VideoLikesCensusVo> vos = null;
        try {
            vos = mapper.videoLikeCensus();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vos;
    }
}
