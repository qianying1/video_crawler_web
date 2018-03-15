package cn.qianying.graduaction.service;

import cn.qianying.graduaction.vo.FictionAndVideoDistributeCensusVo;

import java.util.List;

/**
 * 小说服务
 */
public interface FictionService {

    /**
     * 小说和视频分布统计
     *
     * @return
     */
    List<FictionAndVideoDistributeCensusVo> fictionAndVideoDistributeCensus();
}
