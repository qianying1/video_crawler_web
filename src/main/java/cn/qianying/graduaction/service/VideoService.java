package cn.qianying.graduaction.service;

import cn.qianying.graduaction.vo.VideoLikesCensusVo;

import java.util.List;

/**
 * 视频
 *
 * Created by qianhaibin on 2018/3/8.
 */
public interface VideoService {

    /**
     * 获取视频喜欢人数统计列表
     *
     * @return
     */
    List<VideoLikesCensusVo> videoLikeCensus();
}
