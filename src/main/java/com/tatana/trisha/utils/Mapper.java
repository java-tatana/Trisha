package com.tatana.trisha.utils;

import com.tatana.trisha.dto.*;
import com.tatana.trisha.dto.Occupation;
import com.vk.api.sdk.objects.users.*;

import java.util.stream.Collectors;

public class Mapper {


    public static UserEntity userFullToUserEntity(UserFull userFull) {
        UserEntity userEntity = new UserEntity();
        userEntity.setCity(new City());
        userEntity.setCountry(new Country());
        userEntity.setOccupation(new Occupation());

        userEntity.setFirstName(userFull.getFirstName());
        userEntity.setLastName(userFull.getLastName());
        userEntity.setPhoto200Orig(userFull.getPhoto200Orig());
        userEntity.setScreenName(userFull.getScreenName());
        userEntity.setUserId(userFull.getId());
        userEntity.setAbout(userFull.getAbout());
        userEntity.setActivities(userFull.getActivities());
        userEntity.setBdate(userFull.getBdate());
        userEntity.setBooks(userFull.getBooks());
        userEntity.setCareerEntity(userFull.getCareer()!=null ?
                userFull.getCareer().stream()
                .map(Mapper::careerToCareerEntity)
                .collect(Collectors.toList()) : null);
        userEntity.getCity().setId(userFull.getCity() !=null ? userFull.getCity().getId() : null);
        userEntity.getCity().setTitle(userFull.getCity()!=null ? userFull.getCity().getTitle() : null);
        userEntity.setCommonCount(userFull.getCommonCount());
        userEntity.getCountry().setCountryId(userFull.getCountry() != null ? userFull.getCountry().getId() : null);
        userEntity.getCountry().setTitle(userFull.getCountry() != null ? userFull.getCountry().getTitle() : null);
        userEntity.setDeactivated(userFull.getDeactivated());
        userEntity.setEducationForm(userFull.getEducationForm());
        userEntity.setEducationStatus(userFull.getEducationStatus());
        userEntity.setFaculty(userFull.getFaculty());
        userEntity.setFacultyName(userFull.getFacultyName());
        userEntity.setFollowersCount(userFull.getFollowersCount());
        userEntity.setGames(userFull.getGames());
        userEntity.setGraduation(userFull.getGraduation());
        userEntity.setHomeTown(userFull.getHomeTown());
        userEntity.setInterests(userFull.getInterests());
        userEntity.setMilitaryEntity(userFull.getMilitary() != null ?
                userFull.getMilitary().stream()
                .map(Mapper::militaryToMilitaryEntity)
                .collect(Collectors.toList()) : null);
        userEntity.setMovies(userFull.getMovies());
        userEntity.setMusic(userFull.getMusic());
        userEntity.setNickname(userFull.getNickname());
        userEntity.getOccupation().setName(userFull.getOccupation() != null ? userFull.getOccupation().getName() : null);
        userEntity.getOccupation().setType(userFull.getOccupation() != null ? userFull.getOccupation().getType() : null);
        userEntity.setPersonalEntity(userFull.getPersonal() != null ?
                personalToPersonalEntity(userFull.getPersonal()) : null);
        userEntity.setRelation(userFull.getRelation());
        userEntity.setRelativeEntities(userFull.getRelatives() != null ?
                userFull.getRelatives().stream()
                .map(Mapper::relativeToRelativeEntity)
                .collect(Collectors.toList()) : null);
        userEntity.setSchoolEntities(userFull.getSchools() != null ?
                userFull.getSchools().stream()
                .map(Mapper::schoolToSchoolEntity)
                .collect(Collectors.toList()) : null);
        userEntity.setTv(userFull.getTv());
        userEntity.setUniversities(userFull.getUniversities() != null ?
                userFull.getUniversities().stream()
                .map(Mapper::universityToUniversityEntity)
                .collect(Collectors.toList()) : null);
        userEntity.setUniversity(userFull.getUniversity());
        userEntity.setUniversityName(userFull.getUniversityName());
        return userEntity;
    }

    private static CareerEntity careerToCareerEntity(Career career) {
        CareerEntity careerEntity = new CareerEntity();

        careerEntity.setCityId(career.getCityId());
        careerEntity.setCompany(career.getCompany());
        careerEntity.setCountryId(career.getCountryId());
        careerEntity.setDateFrom(career.getFrom());
        careerEntity.setGroupId(career.getGroupId());
        careerEntity.setPosition(career.getPosition());
        careerEntity.setUntil(career.getUntil());

        return careerEntity;
    }

    private static MilitaryEntity militaryToMilitaryEntity(Military military) {
        MilitaryEntity militaryEntity = new MilitaryEntity();

        militaryEntity.setCountryId(military.getCountryId());
        militaryEntity.setDateFrom(military.getFrom());
        militaryEntity.setUnit(military.getUnit());
        militaryEntity.setUnitId(military.getUnitId());
        militaryEntity.setUntil(military.getUntil());
        return militaryEntity;
    }

    private static PersonalEntity personalToPersonalEntity(Personal personal){
        PersonalEntity personalEntity = new PersonalEntity();

        personalEntity.setAlcohol(personal.getAlcohol());
        personalEntity.setInspiredBy(personal.getInspiredBy());
        personalEntity.setLifeMain(personal.getLifeMain());
        personalEntity.setPeopleMain(personal.getPeopleMain());
        personalEntity.setPolitical(personal.getPolitical());
        personalEntity.setReligion(personal.getReligion());
        personalEntity.setSmoking(personal.getSmoking());

        return personalEntity;
    }

    private static RelativeEntity relativeToRelativeEntity(Relative relative){
        RelativeEntity relativeEntity =new RelativeEntity();
        relativeEntity.setType(relative.getType());
        return relativeEntity;
    }

    private static SchoolEntity schoolToSchoolEntity(School school){
        SchoolEntity schoolEntity = new SchoolEntity();

        schoolEntity.setCity(school.getCity());
        schoolEntity.setClassName(school.getClassName());
        schoolEntity.setCountry(school.getCountry());
        schoolEntity.setName(school.getName());
        schoolEntity.setType(school.getType());
        schoolEntity.setTypeStr(school.getTypeStr());
        schoolEntity.setYearFrom(school.getYearFrom());
        schoolEntity.setYearGraduated(school.getYearGraduated());
        schoolEntity.setYearTo(school.getYearTo());

        return schoolEntity;
    }

    private static UniversityEntity universityToUniversityEntity(University university){
        UniversityEntity universityEntity = new UniversityEntity();

        universityEntity.setChair(university.getChair());
        universityEntity.setChairName(university.getChairName());
        universityEntity.setCity(university.getCity());
        universityEntity.setCountry(university.getCountry());
        universityEntity.setEducationForm(university.getEducationForm());
        universityEntity.setEducationStatus(university.getEducationStatus());
        universityEntity.setFaculty(university.getFaculty());
        universityEntity.setFacultyName(university.getFacultyName());
        universityEntity.setGraduation(university.getGraduation());
        universityEntity.setName(university.getName());

        return universityEntity;
    }
}
