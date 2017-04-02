package ru.stat.lol;

import com.robrua.orianna.api.core.RiotAPI;
import com.robrua.orianna.type.core.common.QueueType;
import com.robrua.orianna.type.core.common.Region;
import com.robrua.orianna.type.core.league.League;
import com.robrua.orianna.type.core.summoner.Summoner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.stat.lol.model.LeagueInfo;

import java.util.List;

/**
 * Created by aer on 25.03.17.
 */
@Service
public class LolStatService {

    @Value("${lol.api.key}")
    private String riotApiKey;

    public LeagueInfo getSummonerInfo(String summonerName, Region region) {

        LeagueInfo leagueInfo = new LeagueInfo();

        RiotAPI.setRegion(region);
        RiotAPI.setAPIKey(riotApiKey);

        Summoner summoner = RiotAPI.getSummonerByName(summonerName);
        List<League> leagues = RiotAPI.getLeaguesBySummoner(summoner);

        for(League league : leagues) {
            if(league.getQueueType().equals(QueueType.RANKED_SOLO_5x5)) {

                leagueInfo.setLeagueName(league.getName());
                leagueInfo.setLeagueDivision(league.getParticipantEntry().getDivision());
                leagueInfo.setLeagueTierName(league.getTier().name());
            }

        }

        return  leagueInfo;

    }
}
