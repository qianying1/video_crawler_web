package cn.qianying.graduaction.service.impl;

import cn.qianying.graduaction.dao.mapper.FictionMapper;
import cn.qianying.graduaction.service.FictionService;
import cn.qianying.graduaction.vo.FictionAndVideoDistributeCensusVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 小说服务
 */
@Service("fictionServiceImpl")
public class FictionServiceImpl implements FictionService{

    @Resource(name="fictionMapper")
    private FictionMapper mapper;
    /**
     * 小说和视频分布统计
     *
     * @return
     */
    public List<FictionAndVideoDistributeCensusVo> fictionAndVideoDistributeCensus(){
        try{
            return mapper.fictionAndVideoDistributeCensus();
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
