package ru.stat.overwatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.stat.overwatch.model.OvwProfile;

import javax.faces.bean.ViewScoped;

/**
 * Created by aer on 02.04.17.
 */
@Component
@ViewScoped
public class OverwatchViewModel {


    @Autowired
    private OvwStatService ovwStatService;

    private OvwProfile ovwProfile;
    private String battleTag;



    public void fillProfileInfo(){
        try {
            ovwProfile = ovwStatService.getProfileInfo(battleTag);
        } catch (Exception e) {
             e.printStackTrace();
        }
    }

    public void setOvwProfile(OvwProfile ovwProfile) {
        this.ovwProfile = ovwProfile;
    }

    public OvwProfile getOvwProfile() {
        return ovwProfile;
    }

    public String getBattleTag() {
        return battleTag;
    }

    public void setBattleTag(String battleTag) {
        this.battleTag = battleTag;
    }
}
