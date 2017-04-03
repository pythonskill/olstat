package ru.stat.overwatch;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import ru.stat.overwatch.model.OvwProfile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by aer on 30.03.17.
 */
@Service
public class OvwStatService {

    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                 reader.close();
        }
    }





    public OvwProfile getProfileInfo(String battletag) throws Exception {

        String url = "https://api.lootbox.eu/pc/eu/%s/profile";
        String json = readUrl(String.format(url, battletag));

        Gson gson = new Gson();
        OvwProfile ovwProfile = gson.fromJson(json, OvwProfile.class);
        return ovwProfile;
    }


}
