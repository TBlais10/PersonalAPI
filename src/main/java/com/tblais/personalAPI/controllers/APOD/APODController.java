package com.tblais.personalAPI.controllers.APOD;

import com.tblais.personalAPI.APOD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/apod")
public class APODController {
    @Autowired
    private Environment env;

    @GetMapping ("/")
    public APOD apodInfo (RestTemplate restTemplate) {
        String URL = "https://api.nasa.gov/planetary/apod?api_key=" + env.getProperty("nasa.key");

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

    @GetMapping("/env")
    public String envTest(){
        return env.getProperty("nasa.key");
    }
}
