package cn.qianying.graduaction.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 页面分发器
 */
@Controller("dispatcherController")
@RequestMapping("/go/{keyword}")
public class DispatcherController {

    /**
     * 跳转其他页面的关键字
     */
    private final String GO_KEYWORD = "census";
    /**
     * 首页
     */
    private final String INDEX_PAGE = "/index";

    /**
     * 视频喜欢统计
     *
     * @param keyword
     * @return
     */
    @RequestMapping(value = "/videoLikesCensus", method = RequestMethod.GET)
    public String videoPopularityCensus(@PathVariable("keyword") String keyword) {
        if (!StringUtils.equals(keyword, GO_KEYWORD)) {
            return INDEX_PAGE;
        }
        return "census/video_likes_census";
    }

    /**
     * 视频长度统计
     *
     * @return
     */
    @RequestMapping(value = "/videoLengthCensus", method = RequestMethod.GET)
    public String videoLengthCensus() {
        return "census/video_len_distribute_census";
    }

    /**
     * 视频收益分布统计
     *
     * @return
     */
    @RequestMapping(value = "/videoIncomeDistributeCensus", method = RequestMethod.GET)
    public String videoIncomeDistributeCensus() {
        return "census/video_income_distribute_census";
    }

    /**
     * 视频评论分布统计
     *
     * @return
     */
    @RequestMapping(value = "/videoCommentsCensus", method = RequestMethod.GET)
    public String userDistributeCensus() {
        return "census/video_comments_distribute_census";
    }

    /**
     * 作者年龄段分布统计
     *
     * @return
     */
    @RequestMapping(value = "/authorAgeDistributeCensus", method = RequestMethod.GET)
    public String authorAgeDistributeCensus() {
        return "census/author_age_distribute_census";
    }

    /**
     * 评论数量分布统计
     *
     * @return
     */
    @RequestMapping(value = "/commentCountDistributeCensus", method = RequestMethod.GET)
    public String commentCountDistributeCensus() {
        return "census/comment_count_distribute_census";
    }

    /**
     * 视频收藏量统计
     *
     * @return
     */
    @RequestMapping(value = "/favoriteCountCensus", method = RequestMethod.GET)
    public String favoriteCountCensus() {
        return "census/favorite_count_census";
    }

    /**
     * 视频类型分布统计
     *
     * @return
     */
    @RequestMapping(value = "/typeAuthorDistributeCensus", method = RequestMethod.GET)
    public String typeDistributeCensus() {
        return "census/type_author_distribute_census";
    }

    /**
     * 小说和视频分布统计
     *
     * @return
     */
    @RequestMapping(value = "/fictionAndVideoDistributeCensus", method = RequestMethod.GET)
    public String fictionAndVideoDistributeCensus() {
        return "census/fiction_and_video_distribute_census";
    }

    /**
     * 视频作者性别比例分布统计
     *
     * @return
     */
    @RequestMapping(value = "/videoAuthorSexRateCensus", method = RequestMethod.GET)
    public String videoAuthorSexRateCensus() {
        return "census/video_author_sexRate_census";
    }

    /**
     * 类型视频占比
     *
     * @return
     */
    @RequestMapping(value = "/typeVideRateCensus", method = RequestMethod.GET)
    public String typeVideRateCensus() {
        return "census/type_vide_rate_census";
    }

    /**
     * 主页
     *
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
