package cn.qianying.graduaction.dao.mapper;

import cn.qianying.graduaction.domain.AnalizedMessage;
import cn.qianying.graduaction.domain.GrabMessage;
import org.springframework.stereotype.Repository;

/**
 * 抓取的信息
 */
@Repository("grabMessageMapper")
public interface GrabMessageMapper extends CommonMapper<GrabMessage> {

    /*public int addRecord(AnalizedMessage analizedMessage);

    public int saveOrUpdate(AnalizedMessage analizedMessage);

    public AnalizedMessage getDetail(String id);*/

}
