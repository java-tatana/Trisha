package com.tatana.trisha.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("deactivated")
    private String deactivated;

    @JsonProperty("is_closed")
    private boolean isClosed;

    @JsonProperty("can_access_closed")
    private boolean canAccessClosed;

    @Embedded
    @JsonProperty("career")
    private Career career;

}
