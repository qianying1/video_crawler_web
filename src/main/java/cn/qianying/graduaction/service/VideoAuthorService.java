package cn.qianying.graduaction.service;

import cn.qianying.graduaction.vo.AuthorTypeDistributeVo;
import cn.qianying.graduaction.vo.VideoAuthorSexRateCensusVo;

import java.util.List;

/**
 * 视频作者服务
 */
public interface VideoAuthorService {

    /**
     * 视频作者类型分布信息统计
     *
     * @return
     */
    List<AuthorTypeDistributeVo> authorTypeDistruteCensus();

    /**
     * 视频作者性别比例分布统计
     *
     * @return
     */
    List<VideoAuthorSexRateCensusVo> videoAuthorSexRateCensus();
}
