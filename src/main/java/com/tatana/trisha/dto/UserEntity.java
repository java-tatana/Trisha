package com.tatana.trisha.dto;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users", schema = "trisha")
public class UserEntity {

    private Long id;
    private Integer userId;
    private String firstName;
    private String lastName;
    private String photo200Orig;
    private String screenName;
    private Integer sex;
    private String deactivated;

    private String bdate;
    @Embedded
    private City city;
    @Embedded
    private Country country;
    private String homeTown;
    private Integer hasMobile;
    private String nickname;
    private Integer followersCount;
    private Integer commonCount;
    @Embedded
    private Occupation occupation;
    private List<MilitaryEntity> militaryEntity;
    private Integer university;
    private String universityName;
    private Integer faculty;
    private String facultyName;
    private Integer graduation;
    private String educationForm;
    private String educationStatus;
    private Integer relation;
    @Embedded
    private PersonalEntity personalEntity;
    private String interests;
    private String music;
    private String activities;
    private String movies;
    private String tv;
    private String books;
    private String games;
    private List<UniversityEntity> universities;
    private List<SchoolEntity> schoolEntities;
    private String about;
    private List<RelativeEntity> relativeEntities;
    private List<CareerEntity> careerEntity;

    public UserEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",  updatable = false, nullable = false, unique=true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "photo_200_orig")
    public String getPhoto200Orig() {
        return photo200Orig;
    }

    public void setPhoto200Orig(String photo200Orig) {
        this.photo200Orig = photo200Orig;
    }

    @Column(name = "screen_name")
    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @Column(name = "deactivated")
    public String getDeactivated() {
        return deactivated;
    }

    public void setDeactivated(String deactivated) {
        this.deactivated = deactivated;
    }

    @OneToMany(targetEntity = CareerEntity.class, mappedBy = "userEntity", fetch = FetchType.LAZY)
    public List<CareerEntity> getCareerEntity() {
        return careerEntity;
    }

    public void setCareerEntity(List<CareerEntity> careerEntity) {
        this.careerEntity = careerEntity;
    }

    @Column(name = "bdate")
    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    @Column(name = "city")
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Column(name = "country")
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Column(name = "home_town")
    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Column(name = "has_mobile")
    public Integer getHasMobile() {
        return hasMobile;
    }

    public void setHasMobile(Integer hasMobile) {
        this.hasMobile = hasMobile;
    }

    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Column(name = "followers_count")
    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    @Column(name = "common_count")
    public Integer getCommonCount() {
        return commonCount;
    }

    public void setCommonCount(Integer commonCount) {
        this.commonCount = commonCount;
    }

    @Column(name = "occupation")
    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    @OneToMany(targetEntity = MilitaryEntity.class, mappedBy = "userEntity", fetch = FetchType.LAZY)
    public List<MilitaryEntity> getMilitaryEntity() {
        return militaryEntity;
    }

    public void setMilitaryEntity(List<MilitaryEntity> militaryEntity) {
        this.militaryEntity = militaryEntity;
    }

    @Column(name = "university")
    public Integer getUniversity() {
        return university;
    }

    public void setUniversity(Integer university) {
        this.university = university;
    }

    @Column(name = "university_name")
    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
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

    @Column(name = "graduation")
    public Integer getGraduation() {
        return graduation;
    }

    public void setGraduation(Integer graduation) {
        this.graduation = graduation;
    }

    @Column(name = "educatio_form")
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

    @Column(name = "relation")
    public Integer getRelation() {
        return relation;
    }

    public void setRelation(Integer relation) {
        this.relation = relation;
    }

    @Column(name = "personalEntity")
    public PersonalEntity getPersonalEntity() {
        return personalEntity;
    }

    public void setPersonalEntity(PersonalEntity personalEntity) {
        this.personalEntity = personalEntity;
    }

    @Column(name = "interests")
    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Column(name = "music")
    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    @Column(name = "activities")
    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    @Column(name = "movies")
    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }

    @Column(name = "tv")
    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    @Column(name = "books")
    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    @Column(name = "games")
    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    @OneToMany(targetEntity = UniversityEntity.class, mappedBy = "userEntity", fetch = FetchType.LAZY)
    public List<UniversityEntity> getUniversities() {
        return universities;
    }

    public void setUniversities(List<UniversityEntity> universities) {
        this.universities = universities;
    }

    @OneToMany(targetEntity = SchoolEntity.class, mappedBy = "userEntity", fetch = FetchType.LAZY)
    public List<SchoolEntity> getSchoolEntities() {
        return schoolEntities;
    }

    public void setSchoolEntities(List<SchoolEntity> schoolEntities) {
        this.schoolEntities = schoolEntities;
    }

    @Column(name = "about")
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @OneToMany(targetEntity = RelativeEntity.class, mappedBy = "userEntity", fetch = FetchType.LAZY)
    public List<RelativeEntity> getRelativeEntities() {
        return relativeEntities;
    }

    public void setRelativeEntities(List<RelativeEntity> relativeEntities) {
        this.relativeEntities = relativeEntities;
    }
}
