package cn.qianying.graduaction.dao.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.qianying.graduaction.domain.AnalizedMessage;

/**
 * 已分析信息
 */
@Repository("analizedMessageMapper")
public interface AnalizedMessageMapper extends CommonMapper<AnalizedMessage> {

	/*public List<AnalizedMessage> listAll();

	public int addRecord(AnalizedMessage analizedMessage);

	public int saveOrUpdate(AnalizedMessage analizedMessage);

	public AnalizedMessage getDetail(String id);*/
}
