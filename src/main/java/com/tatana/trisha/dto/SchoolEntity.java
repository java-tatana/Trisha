package com.tatana.trisha.dto;

import javax.persistence.*;

@Entity
@Table(name = "school", schema = "trisha")
public class SchoolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "school_id", updatable = false, nullable = false, unique=true)
    private Long schoolId;
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private UserEntity userEntity;
    private Integer country;
    private Integer city;
    private String name;
    private Integer yearFrom;
    private Integer yearTo;
    private Integer yearGraduated;
    private String className;
    private Integer type;
    private String typeStr;

    public SchoolEntity() {
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @Column(name = "country")
    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    @Column(name = "city")
    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "year_from")
    public Integer getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(Integer yearFrom) {
        this.yearFrom = yearFrom;
    }

    @Column(name = "year_to")
    public Integer getYearTo() {
        return yearTo;
    }

    public void setYearTo(Integer yearTo) {
        this.yearTo = yearTo;
    }

    @Column(name = "year_graduated")
    public Integer getYearGraduated() {
        return yearGraduated;
    }

    public void setYearGraduated(Integer yearGraduated) {
        this.yearGraduated = yearGraduated;
    }

    @Column(name = "class_name")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Column(name = "type_str")
    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }

    @Override
    public String toString() {
        return "SchoolEntity{" +
                ", country=" + country +
                ", city=" + city +
                ", name='" + name + '\'' +
                ", yearFrom=" + yearFrom +
                ", yearTo=" + yearTo +
                ", yearGraduated=" + yearGraduated +
                ", className='" + className + '\'' +
                ", type=" + type +
                ", typeStr='" + typeStr + '\'' +
                '}';
    }
}
