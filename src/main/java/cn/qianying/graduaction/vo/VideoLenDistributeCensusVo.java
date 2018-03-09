package cn.qianying.graduaction.vo;

import java.io.Serializable;

/**
 * 视频长度分布统计分析
 * <p>
 * Created by qianhaibin on 2018/3/9.
 */
public class VideoLenDistributeCensusVo implements Serializable {
    /**
     * 视频类型id
     */
    private Long typeId;
    /**
     * 视频类型名称
     */
    private String typeName;
    /**
     * 视频长度
     */
    private Long duration;
    /**
     * 视频数量
     */
    private Long videoCount;
    /**
     * 视频点击数量
     */
    private Long views;

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

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
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

    @Override
    public String toString() {
        return "VideoLenDistributeCensusVo{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", duration=" + duration +
                ", videoCount=" + videoCount +
                ", views=" + views +
                '}';
    }
}
