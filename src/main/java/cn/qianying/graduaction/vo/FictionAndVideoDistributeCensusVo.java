package cn.qianying.graduaction.vo;

import java.io.Serializable;

/**
 * 小说和视频分布统计vo
 */
public class FictionAndVideoDistributeCensusVo implements Serializable{
    /**
     * 类型id
     */
    private Long typeId;
    /**
     * 类型名称
     */
    private String typeName;
    /**
     * 收藏人数
     */
    private Long favorite;
    /**
     * 弹幕数量
     */
    private Long masks;
    /**
     * 点击次数
     */
    private Long views;
    /**
     * 视频数量
     */
    private Long counts;

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

    public Long getFavorite() {
        return favorite;
    }

    public void setFavorite(Long favorite) {
        this.favorite = favorite;
    }

    public Long getMasks() {
        return masks;
    }

    public void setMasks(Long masks) {
        this.masks = masks;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public Long getCounts() {
        return counts;
    }

    public void setCounts(Long counts) {
        this.counts = counts;
    }

    @Override
    public String toString() {
        return "FictionAndVideoDistributeCensusVo{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", favorite=" + favorite +
                ", masks=" + masks +
                ", views=" + views +
                ", counts=" + counts +
                '}';
    }
}
