package cn.qianying.graduaction.vo;

import java.io.Serializable;

/**
 * 类型视频占比vo
 */
public class TypeVideoRateDistributeVo implements Serializable {
    /**
     * 视频类型id
     */
    private Long typeId;
    /**
     * 视频类型名称
     */
    private String typeName;
    /**
     * 类型视频数量
     */
    private Long videoCount;

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

    public Long getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(Long videoCount) {
        this.videoCount = videoCount;
    }

    @Override
    public String toString() {
        return "TypeVideoRateDistributeVo{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", videoCount=" + videoCount +
                '}';
    }
}
