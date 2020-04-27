package com.tatana.trisha.dto;

import javax.persistence.*;

@Entity
@Table(name = "militaries", schema = "trisha")
public class MilitaryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "military_id",  updatable = false, nullable = false, unique=true)
    private Long militaryId;
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private UserEntity userEntity;
    private String unit;
    private Integer unitId;
    private Integer countryId;
    private Integer dateFrom;
    private Integer until;

    public MilitaryEntity() {
    }

    public Long getMilitaryId() {
        return militaryId;
    }

    public void setMilitaryId(Long militaryId) {
        this.militaryId = militaryId;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Integer dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    @Override
    public String toString() {
        return "MilitaryEntity{" +
                "unit='" + unit + '\'' +
                ", unitId=" + unitId +
                ", countryId=" + countryId +
                ", from=" + dateFrom +
                ", until=" + until +
                '}';
    }
}
