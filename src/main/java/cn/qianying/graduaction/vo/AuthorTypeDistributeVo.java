package cn.qianying.graduaction.vo;

import java.io.Serializable;

/**
 * 视频作者类型分布vo
 */
public class AuthorTypeDistributeVo implements Serializable{
    /**
     * 类型id
     */
    private Long typeId=0l;
    /**
     * 类型名称
     */
    private String typeName="";
    /**
     * 作者数量
     */
    private Long authorCount=0l;
    /**
     * 追随者数量
     */
    private Long follower=0l;
    /**
     * 观众数量
     */
    private Long audienceCount=0l;
    /**
     * 关注人数
     */
    private Long attentionCount=0l;
    /**
     * 视频数量
     */
    private Long videoCount=0l;

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

    public Long getAuthorCount() {
        return authorCount;
    }

    public void setAuthorCount(Long authorCount) {
        this.authorCount = authorCount;
    }

    public Long getFollower() {
        return follower;
    }

    public void setFollower(Long follower) {
        this.follower = follower;
    }

    public Long getAudienceCount() {
        return audienceCount;
    }

    public void setAudienceCount(Long audienceCount) {
        this.audienceCount = audienceCount;
    }

    public Long getAttentionCount() {
        return attentionCount;
    }

    public void setAttentionCount(Long attentionCount) {
        this.attentionCount = attentionCount;
    }

    public Long getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(Long videoCount) {
        this.videoCount = videoCount;
    }
}
