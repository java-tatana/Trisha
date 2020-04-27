package com.tatana.trisha.dto;

import javax.persistence.*;

@Entity
@Table(name = "relative", schema = "trisha")
public class RelativeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "relative_id", updatable = false, nullable = false, unique=true)
    private Long relativeId;
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private UserEntity userEntity;
    private String type;

    public RelativeEntity() {
    }

    public Long getRelativeId() {
        return relativeId;
    }

    public void setRelativeId(Long relativeId) {
        this.relativeId = relativeId;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @Column(name = "relative_type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "RelativeEntity{" +
                ", type='" + type + '\'' +
                '}';
    }
}
