package ru.stat.services;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import ru.stat.model.overwatch.OvwProfile;

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


    public String getProfileInfo(String battletag) throws Exception {
        String url = "https://api.lootbox.eu/pc/eu/copper-2356/profile";
        String json = readUrl(url);

        Gson gson = new Gson();
        OvwProfile staff = gson.fromJson(json, OvwProfile.class);
        return staff.getData().getLevel().toString();
    }


}
