package cn.qianying.graduaction.dao.mapper;

import cn.qianying.graduaction.domain.VideoAuthor;
import cn.qianying.graduaction.vo.AuthorTypeDistributeVo;
import cn.qianying.graduaction.vo.VideoAuthorSexRateCensusVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 视频作者
 */
@Repository("videoAuthorMapper")
public interface VideoAuthorMapper extends CommonMapper<VideoAuthor> {

    /*int insert(VideoAuthor videoAuthor);

    int selectVideoAuthors(String authorPageUrl);*/

    /**
     * 视频作者类型分布统计
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
