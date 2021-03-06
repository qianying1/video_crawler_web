package cn.qianying.graduaction.service.impl;

import cn.qianying.graduaction.dao.mapper.VideoMapper;
import cn.qianying.graduaction.vo.VideoCommentsDistributeCensusVo;
import cn.qianying.graduaction.vo.VideoIncomeDistributeCensusVo;
import cn.qianying.graduaction.vo.VideoLenDistributeCensusVo;
import cn.qianying.graduaction.vo.VideoLikesCensusVo;
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

    /**
     * 视频长度分布统计
     *
     * @return
     */
    public List<VideoLenDistributeCensusVo> videoLenDistributeCensus(){
        List<VideoLenDistributeCensusVo> vos = null;
        try {
            vos = mapper.videoLenDistributeCensus();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vos;
    }

    /**
     * 视频评论分布统计
     *
     * @return
     */
    public List<VideoCommentsDistributeCensusVo> videoCommentsDistributeCensus(){
        List<VideoCommentsDistributeCensusVo> vos = null;
        try {
            vos = mapper.videoCommentsDistributeCensus();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vos;
    }

    /**
     * 视频收益分布统计
     *
     * @return
     */
    public List<VideoIncomeDistributeCensusVo> videoIncomeDistributeCensus(){
        List<VideoIncomeDistributeCensusVo> vos = null;
        try {
            vos = mapper.videoIncomeDistributeCensus();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vos;
    }
}
