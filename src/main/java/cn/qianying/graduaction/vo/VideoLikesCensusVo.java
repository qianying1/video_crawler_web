package cn.qianying.graduaction.vo;

import java.io.Serializable;

/**
 * 用户喜欢人数统计vo
 * <p>
 * Created by qianhaibin on 2018/3/8.
 */
public class VideoLikesCensusVo implements Serializable {
    private static final long serialVersionUID = -6138304750843680637L;
    /**
     * 视频id
     */
    private Long id;
    /**
     * 喜欢视频的用户数量
     */
    private Long likes;
    /**
     * 视频点击人数
     */
    private Long views;
    /**
     * 视频收藏人数
     */
    private Long favorite;
    /**
     * 视频类型名称
     */
    private String type;
    /**
     * 视频的数量
     */
    private Long videoCount;
    /**
     * 视频类型id
     */
    private Long typeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(Long videoCount) {
        this.videoCount = videoCount;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Long getFavorite() {
        return favorite;
    }

    public void setFavorite(Long favorite) {
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        return "VideoLikesCensusVo{" +
                "id=" + id +
                ", likes=" + likes +
                ", views=" + views +
                ", favorite=" + favorite +
                ", type='" + type + '\'' +
                ", videoCount=" + videoCount +
                ", typeId=" + typeId +
                '}';
    }
}
