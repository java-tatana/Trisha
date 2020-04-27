package com.tatana.trisha.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Occupation {
    private String type;
    private Integer occupationId;
    private String name;

    public Occupation() {
    }

    @Column(name = "occupation_type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "occupation_id")
    public Integer getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(Integer occupationId) {
        this.occupationId = occupationId;
    }

    @Column(name = "occupation_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Occupation{" +
                "type='" + type + '\'' +
                ", id=" + occupationId +
                ", name='" + name + '\'' +
                '}';
    }
}