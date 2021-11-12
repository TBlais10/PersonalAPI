package com.tblais.personalAPI.controllers.APOD;

import com.tblais.personalAPI.APOD;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class APODController {
    private static final String MY_API_KEY = "hF4GZKXvAM5yV5lroYtw7icPcfp297Q8UJn8xgAd";

    @GetMapping ("/apod")
    public APOD apodInfo (RestTemplate restTemplate) {
        String URL = "https://api.nasa.gov/planetary/apod?api_key=" + MY_API_KEY;

        APOD apod = restTemplate.getForObject(URL, APOD.class);

        return apod;
    }

    @GetMapping("/apodtest")
    public String apodTest () {return "com.tblais.personalAPI.controllers.APOD TESTING";
    }

    @GetMapping("/adod")
    public String postApod(
            @RequestParam (name = "param", required = false) String requestParm) {
        return "POST com.tblais.personalAPI.controllers.APOD";
    }
}
