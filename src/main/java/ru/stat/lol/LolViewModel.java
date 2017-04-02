package ru.stat.lol;

import com.robrua.orianna.type.core.common.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.stat.lol.model.LeagueInfo;

import javax.faces.bean.ViewScoped;

/**
 * Created by aer on 02.04.17.
 */
@Component
@ViewScoped
public class LolViewModel {

    @Autowired
    private LolStatService lolStatService;

    private String summonerName;
    private Region region;
    private LeagueInfo leagueInfo;


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
}
