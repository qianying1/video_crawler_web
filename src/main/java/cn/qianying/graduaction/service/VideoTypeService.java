package cn.qianying.graduaction.service;

import cn.qianying.graduaction.vo.TypeVideoRateDistributeVo;

import java.util.List;

/**
 * 视频类型
 */
public interface VideoTypeService {
    /**
     * 类型视频占比
     *
     * @return
     */
    List<TypeVideoRateDistributeVo> typeVideRateCensus();
}
