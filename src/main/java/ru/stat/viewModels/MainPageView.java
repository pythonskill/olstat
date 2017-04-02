package ru.stat.viewModels;

import com.robrua.orianna.type.core.common.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.stat.lol.model.LeagueInfo;
import ru.stat.lol.LolStatService;
import ru.stat.overwatch.OvwStatService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@Component
@ViewScoped
public class MainPageView implements Serializable {

    @Autowired
    private LolStatService lolStatService;

    @Autowired
    private OvwStatService ovwStatService;

    private String summonerName;
    private Region region;
    private LeagueInfo leagueInfo;


    @PostConstruct
    public void init() {
    }

    public void getSummonerLeagueInfo() {
        leagueInfo = lolStatService.getSummonerInfo(summonerName, region);
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public LeagueInfo getLeagueInfo() {
        return leagueInfo;
    }

    public void setLeagueInfo(LeagueInfo leagueInfo) {
        this.leagueInfo = leagueInfo;
    }

    public String getOvwProfile(){
        try {
            return ovwStatService.getProfileInfo(" ");
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}