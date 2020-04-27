package com.tatana.trisha.dto;

import javax.persistence.*;

@Entity
@Table(name = "university", schema = "trisha")
public class UniversityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "university_id",  updatable = false, nullable = false, unique=true)
    private Long universityId;
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private UserEntity userEntity;
    private Integer country;
    private Integer city;
    private String name;
    private Integer faculty;
    private String facultyName;
    private Integer chair;
    private String chairName;
    private Integer graduation;
    private String educationForm;
    private String educationStatus;

    public UniversityEntity() {
    }

    public Long getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Long universityId) {
        this.universityId = universityId;
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

    @Column(name = "faculty")
    public Integer getFaculty() {
        return faculty;
    }

    public void setFaculty(Integer faculty) {
        this.faculty = faculty;
    }

    @Column(name = "faculty_name")
    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    @Column(name = "chair")
    public Integer getChair() {
        return chair;
    }

    public void setChair(Integer chair) {
        this.chair = chair;
    }

    @Column(name = "chair_name")
    public String getChairName() {
        return chairName;
    }

    public void setChairName(String chairName) {
        this.chairName = chairName;
    }

    @Column(name = "graduation")
    public Integer getGraduation() {
        return graduation;
    }

    public void setGraduation(Integer graduation) {
        this.graduation = graduation;
    }

    @Column(name = "education_form")
    public String getEducationForm() {
        return educationForm;
    }

    public void setEducationForm(String educationForm) {
        this.educationForm = educationForm;
    }

    @Column(name = "education_status")
    public String getEducationStatus() {
        return educationStatus;
    }

    public void setEducationStatus(String educationStatus) {
        this.educationStatus = educationStatus;
    }

    @Override
    public String toString() {
        return "UniversityEntity{" +
                ", country=" + country +
                ", city=" + city +
                ", name='" + name + '\'' +
                ", faculty=" + faculty +
                ", facultyName='" + facultyName + '\'' +
                ", chair=" + chair +
                ", chairName='" + chairName + '\'' +
                ", graduation=" + graduation +
                ", educationForm='" + educationForm + '\'' +
                ", educationStatus='" + educationStatus + '\'' +
                '}';
    }
}
