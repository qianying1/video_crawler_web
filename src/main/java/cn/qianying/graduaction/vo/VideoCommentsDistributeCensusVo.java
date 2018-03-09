package cn.qianying.graduaction.vo;

import java.io.Serializable;

/**
 * 视频评论分布统计
 * <p>
 * Created by qianhaibin on 2018/3/9.
 */
public class VideoCommentsDistributeCensusVo implements Serializable {
    /**
     * 视频类型id
     */
    private Long typeId;
    /**
     * 视频类型名称
     */
    private String typeName;
    /**
     * 视频弹幕数量
     */
    private Long mask;
    /**
     * 视频评论数量(包括回复)
     */
    private Long comments;
    /**
     * 视频数量
     */
    private Long videoCount;
    /**
     * 视频常规评论数量
     */
    private Long reviews;

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Long getMask() {
        return mask;
    }

    public void setMask(Long mask) {
        this.mask = mask;
    }

    public Long getComments() {
        return comments;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public Long getReviews() {
        return reviews;
    }

    public void setReviews(Long reviews) {
        this.reviews = reviews;
    }

    public Long getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(Long videoCount) {
        this.videoCount = videoCount;
    }

    @Override
    public String toString() {
        return "VideoCommentsDistributeCensusVo{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", mask=" + mask +
                ", comments=" + comments +
                ", videoCount=" + videoCount +
                ", reviews=" + reviews +
                '}';
    }
}
