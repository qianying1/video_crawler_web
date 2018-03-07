package cn.qianying.graduaction.dao.mapper;

import org.springframework.stereotype.Repository;

import cn.qianying.graduaction.domain.WebSites;

/**
 * 网站
 */
@Repository("websitesMapper")
public interface WebsitesMapper extends CommonMapper<WebSites> {

	/*boolean acfunIsInserted(String webUrl);*/

}
