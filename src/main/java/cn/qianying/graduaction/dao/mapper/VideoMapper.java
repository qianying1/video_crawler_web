package cn.qianying.graduaction.dao.mapper;

import cn.qianying.graduaction.domain.GrabLib;
import cn.qianying.graduaction.vo.VideoLenDistributeCensusVo;
import cn.qianying.graduaction.vo.VideoLikesCensusVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 视频
 */
@Repository("videoMapper")
public interface VideoMapper extends CommonMapper<GrabLib> {

	/*public void insert(int contentId, String webName, String ahref, String flag);

	public void inserts(int contentId, String webName, List<String> ahrefList, String flag);

	public boolean isGrabed(String url);

	public boolean selectGrabLibs(String url);*/

    /**
     * 视频喜欢人数分布统计
     *
     * @return
     */
    List<VideoLikesCensusVo> videoLikeCensus();

    /**
     * 视频长度分布统计
     *
     * @return
     */
    List<VideoLenDistributeCensusVo> videoLenDistributeCensus();
}
