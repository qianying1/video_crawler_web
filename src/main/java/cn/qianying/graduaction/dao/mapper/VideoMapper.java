package cn.qianying.graduaction.dao.mapper;

import cn.qianying.graduaction.vo.VideoCommentsDistributeCensusVo;
import cn.qianying.graduaction.vo.VideoIncomeDistributeCensusVo;
import cn.qianying.graduaction.vo.VideoLenDistributeCensusVo;
import cn.qianying.graduaction.vo.VideoLikesCensusVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 视频
 */
@Repository("videoMapper")
public interface VideoMapper {

    /**
     * 视频喜欢人数分布统计
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
