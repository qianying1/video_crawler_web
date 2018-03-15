package cn.qianying.graduaction.dao.mapper;

import cn.qianying.graduaction.vo.FictionAndVideoDistributeCensusVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 小说dao
 */
@Repository("fictionMapper")
public interface FictionMapper {

    /**
     * 小说和视频分布统计
     *
     * @return
     */
    List<FictionAndVideoDistributeCensusVo> fictionAndVideoDistributeCensus();

}
