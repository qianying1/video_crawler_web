package cn.qianying.graduaction.dao.mapper;

import cn.qianying.graduaction.vo.TypeVideoRateDistributeVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 视频类型
 *
 * Created by qianhaibin on 2018/3/7.
 */
@Repository("styleMapper")
public interface StyleMapper extends CommonMapper{

    /**
     * 类型视频占比
     *
     * @return
     */
    List<TypeVideoRateDistributeVo> typeVideRateCensus();
}
