package ru.stat.overwatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ViewScoped;

/**
 * Created by aer on 02.04.17.
 */
@Component
@ViewScoped
public class OverwatchViewModel {


    @Autowired
    private OvwStatService ovwStatService;



    public String getOvwProfile(){
        try {
            return ovwStatService.getProfileInfo(" ");
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
