package cn.qianying.graduaction.service;

import cn.qianying.graduaction.vo.VideoCommentsDistributeCensusVo;
import cn.qianying.graduaction.vo.VideoIncomeDistributeCensusVo;
import cn.qianying.graduaction.vo.VideoLenDistributeCensusVo;
import cn.qianying.graduaction.vo.VideoLikesCensusVo;

import java.util.List;

/**
 * 视频
 * <p>
 * Created by qianhaibin on 2018/3/8.
 */
public interface VideoService {

    /**
     * 获取视频喜欢人数统计列表
     *
     * @return
     */
    List<VideoLikesCensusVo> videoLikeCensus();

    /**
     * 视频长度分布统计
     *
     * @return
     */
    List<VideoLenDistributeCensusVo> videoLenDistributeCensus();

    /**
     * 视频评论分布统计
     *
     * @return
     */
    List<VideoCommentsDistributeCensusVo> videoCommentsDistributeCensus();

    /**
     * 视频收益分布统计
     *
     * @return
     */
    List<VideoIncomeDistributeCensusVo> videoIncomeDistributeCensus();
}
