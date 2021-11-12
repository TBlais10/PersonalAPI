package models;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Species {

    private String name;
    private String average_Height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAverage_Height() {
        return average_Height;
    }

    public void setAverage_Height(String average_Height) {
        this.average_Height = average_Height;
    }

}
