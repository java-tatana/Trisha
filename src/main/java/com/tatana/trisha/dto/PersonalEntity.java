package com.tatana.trisha.dto;

import javax.persistence.Embeddable;

@Embeddable
public class PersonalEntity {

    private Integer political;
    private String religion;
    private String inspiredBy;
    private Integer peopleMain;
    private Integer lifeMain;
    private Integer smoking;
    private Integer alcohol;

    public PersonalEntity() {
    }

    public Integer getPolitical() {
        return political;
    }

    public void setPolitical(Integer political) {
        this.political = political;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getInspiredBy() {
        return inspiredBy;
    }

    public void setInspiredBy(String inspiredBy) {
        this.inspiredBy = inspiredBy;
    }

    public Integer getPeopleMain() {
        return peopleMain;
    }

    public void setPeopleMain(Integer peopleMain) {
        this.peopleMain = peopleMain;
    }

    public Integer getLifeMain() {
        return lifeMain;
    }

    public void setLifeMain(Integer lifeMain) {
        this.lifeMain = lifeMain;
    }

    public Integer getSmoking() {
        return smoking;
    }

    public void setSmoking(Integer smoking) {
        this.smoking = smoking;
    }

    public Integer getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Integer alcohol) {
        this.alcohol = alcohol;
    }

    @Override
    public String toString() {
        return "PersonalEntity{" +
                "political=" + political +
                ", religion='" + religion + '\'' +
                ", inspiredBy='" + inspiredBy + '\'' +
                ", peopleMain=" + peopleMain +
                ", lifeMain=" + lifeMain +
                ", smoking=" + smoking +
                ", alcohol=" + alcohol +
                '}';
    }
}
