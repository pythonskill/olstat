
package ru.stat.overwatch.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class OvwProfileCompetitive {

    @SerializedName("lost")
    private Long mLost;
    @SerializedName("played")
    private String mPlayed;
    @SerializedName("rank")
    private String mRank;
    @SerializedName("rank_img")
    private String mRankImg;
    @SerializedName("wins")
    private String mWins;

    public Long getLost() {
        return mLost;
    }

    public void setLost(Long lost) {
        mLost = lost;
    }

    public String getPlayed() {
        return mPlayed;
    }

    public void setPlayed(String played) {
        mPlayed = played;
    }

    public String getRank() {
        return mRank;
    }

    public void setRank(String rank) {
        mRank = rank;
    }

    public String getRankImg() {
        return mRankImg;
    }

    public void setRankImg(String rankImg) {
        mRankImg = rankImg;
    }

    public String getWins() {
        return mWins;
    }

    public void setWins(String wins) {
        mWins = wins;
    }

}
