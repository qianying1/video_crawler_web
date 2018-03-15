package cn.qianying.graduaction.vo;

import java.io.Serializable;

/**
 * 视频作者类型分布统计vo
 */
public class VideoAuthorSexRateCensusVo implements Serializable {

    /**
     * 视频类型id
     */
    private Long typeId;
    /**
     * 视频类型名称
     */
    private String typeName;
    /**
     * 女性作者人数
     */
    private Long female;
    /**
     * 男性作者人数
     */
    private Long male;
    /**
     * 性别保密作者人数
     */
    private Long secret;

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

    public Long getFemale() {
        return female;
    }

    public void setFemale(Long female) {
        this.female = female;
    }

    public Long getMale() {
        return male;
    }

    public void setMale(Long male) {
        this.male = male;
    }

    public Long getSecret() {
        return secret;
    }

    public void setSecret(Long secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "VideoAuthorSexRateCensusVo{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", female=" + female +
                ", male=" + male +
                ", secret=" + secret +
                '}';
    }
}
