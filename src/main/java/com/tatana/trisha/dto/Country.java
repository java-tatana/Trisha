package com.tatana.trisha.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Country {

    private Integer countryId;
    private String title;

    public Country() {
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @Column(name = "country_type")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId=" + countryId +
                ", title='" + title + '\'' +
                '}';
    }
}
