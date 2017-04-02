
package ru.stat.overwatch.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class OvwProfile {

    @SerializedName("data")
    private OvwProfileData mOvwProfileData;

    public OvwProfileData getData() {
        return mOvwProfileData;
    }

    public void setData(OvwProfileData ovwProfileData) {
        mOvwProfileData = ovwProfileData;
    }

}
