
package ru.stat.overwatch.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class OvwProfileData {

    @SerializedName("avatar")
    private String mAvatar;
    @SerializedName("competitive")
    private OvwProfileCompetitive mOvwProfileCompetitive;
    @SerializedName("games")
    private OvwProfileGames mOvwProfileGames;
    @SerializedName("level")
    private Long mLevel;
    @SerializedName("levelFrame")
    private String mLevelFrame;
    @SerializedName("playtime")
    private OvwProfilePlaytime mOvwProfilePlaytime;
    @SerializedName("star")
    private String mStar;
    @SerializedName("username")
    private String mUsername;

    public String getAvatar() {
        return mAvatar;
    }

    public void setAvatar(String avatar) {
        mAvatar = avatar;
    }

    public OvwProfileCompetitive getCompetitive() {
        return mOvwProfileCompetitive;
    }

    public void setCompetitive(OvwProfileCompetitive ovwProfileCompetitive) {
        mOvwProfileCompetitive = ovwProfileCompetitive;
    }

    public OvwProfileGames getGames() {
        return mOvwProfileGames;
    }

    public void setGames(OvwProfileGames ovwProfileGames) {
        mOvwProfileGames = ovwProfileGames;
    }

    public Long getLevel() {
        return mLevel;
    }

    public void setLevel(Long level) {
        mLevel = level;
    }

    public String getLevelFrame() {
        return mLevelFrame;
    }

    public void setLevelFrame(String levelFrame) {
        mLevelFrame = levelFrame;
    }

    public OvwProfilePlaytime getPlaytime() {
        return mOvwProfilePlaytime;
    }

    public void setPlaytime(OvwProfilePlaytime ovwProfilePlaytime) {
        mOvwProfilePlaytime = ovwProfilePlaytime;
    }

    public String getStar() {
        return mStar;
    }

    public void setStar(String star) {
        mStar = star;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }

}
