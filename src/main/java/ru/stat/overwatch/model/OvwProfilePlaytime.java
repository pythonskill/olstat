
package ru.stat.overwatch.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class OvwProfilePlaytime {

    @SerializedName("competitive")
    private String mCompetitive;
    @SerializedName("quick")
    private String mQuick;

    public String getCompetitive() {
        return mCompetitive;
    }

    public void setCompetitive(String competitive) {
        mCompetitive = competitive;
    }

    public String getQuick() {
        return mQuick;
    }

    public void setQuick(String quick) {
        mQuick = quick;
    }

}
