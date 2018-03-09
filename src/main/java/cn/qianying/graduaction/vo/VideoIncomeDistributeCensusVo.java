package cn.qianying.graduaction.vo;

import java.io.Serializable;

/**
 * 视频作者收益分布统计vo
 *
 * Created by qianhaibin on 2018/3/9.
 */
public class VideoIncomeDistributeCensusVo implements Serializable{

    /**
     * 视频类型id
     */
    private Long typeId;
    /**
     * 视频类型名称
     */
    private String typeName;
    /**
     * 投币数量
     */
    private Long coin;
    /**
     * 分享数量
     */
    private Long share;
    /**
     * 视频数量
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

    public Long getCoin() {
        return coin;
    }

    public void setCoin(Long coin) {
        this.coin = coin;
    }

    public Long getShare() {
        return share;
    }

    public void setShare(Long share) {
        this.share = share;
    }

    public Long getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(Long videoCount) {
        this.videoCount = videoCount;
    }

    @Override
    public String toString() {
        return "VideoIncomeDistributeCensusVo{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", coin=" + coin +
                ", share=" + share +
                ", videoCount=" + videoCount +
                '}';
    }
}
