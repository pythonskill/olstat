package ru.stat.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by aer on 30.03.17.
 */
public class OvwServiceTest {

    @Autowired
    OvwStatService ovwStatService;

    @Test
    public void test_method_1() throws Exception {

        ovwStatService.getProfileInfo("");
        System.out.println(ovwStatService.getProfileInfo(""));
    }
}
