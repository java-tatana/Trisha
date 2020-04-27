package com.tatana.trisha.dto;

import javax.persistence.*;

@Entity
@Table(name = "careers", schema = "trisha")
public class CareerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "career_id",  updatable = false, nullable = false, unique=true)
    private Long careerId;
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private UserEntity userEntity;
    private Integer groupId;
    private String company;
    private Integer countryId;
    private Integer cityId;
    private Integer dateFrom;
    private Integer until;
    private String position;

    public CareerEntity() {
    }

    public Long getCareerId() {
        return careerId;
    }

    public void setCareerId(Long careerId) {
        this.careerId = careerId;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @Column(name = "group_id")
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Column(name = "company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Column(name = "country_id")
    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @Column(name = "city_id")
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Column(name = "dateFrom")
    public Integer getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Integer dateFrom) {
        this.dateFrom = dateFrom;
    }

    @Column(name = "until")
    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "CareerEntity{" +
                "groupId=" + groupId +
                ", company='" + company + '\'' +
                ", countryId=" + countryId +
                ", cityId=" + cityId +
                ", dateFrom=" + dateFrom +
                ", until=" + until +
                ", position='" + position + '\'' +
                '}';
    }
}
