package cn.qianying.graduaction.dao.mapper;

import cn.qianying.graduaction.domain.VideoAuthor;
import org.springframework.stereotype.Repository;

/**
 * 视频作者
 */
@Repository("videoAuthorMapper")
public interface VideoAuthorMapper extends CommonMapper<VideoAuthor> {

    /*int insert(VideoAuthor videoAuthor);

    int selectVideoAuthors(String authorPageUrl);*/

}
