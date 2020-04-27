package com.tatana.trisha.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class City {

    private Integer cityId;
    private String title;

    public City() {
    }

    @Column(name = "city_id")
    public Integer getId() {
        return cityId;
    }

    public void setId(Integer id) {
        this.cityId = id;
    }

    @Column(name = "city_title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + cityId +
                ", title='" + title + '\'' +
                '}';
    }
}
