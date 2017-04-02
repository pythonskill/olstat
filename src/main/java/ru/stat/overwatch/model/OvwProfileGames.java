
package ru.stat.overwatch.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class OvwProfileGames {

    @SerializedName("competitive")
    private OvwProfileCompetitive mOvwProfileCompetitive;
    @SerializedName("quick")
    private OvwProfileQuick mOvwProfileQuick;

    public OvwProfileCompetitive getCompetitive() {
        return mOvwProfileCompetitive;
    }

    public void setCompetitive(OvwProfileCompetitive ovwProfileCompetitive) {
        mOvwProfileCompetitive = ovwProfileCompetitive;
    }

    public OvwProfileQuick getQuick() {
        return mOvwProfileQuick;
    }

    public void setQuick(OvwProfileQuick ovwProfileQuick) {
        mOvwProfileQuick = ovwProfileQuick;
    }

}
