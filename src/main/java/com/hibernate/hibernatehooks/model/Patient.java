package com.hibernate.hibernatehooks.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_by")
    private String updatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @PrePersist
    public void beforeSave() {

        System.out.println("============ Before insert =================");
        createdAt = LocalDateTime.now();
        createdBy = "any value";

    }

    @PostPersist
    public void afterSave() {

        System.out.println("============ After insert =================");

        System.out.println("processing after insert logic");
    }

    @PreUpdate
    public void beforeUpdate() {

        System.out.println("============ Before update =================");

        updatedAt = LocalDateTime.now();
        updatedBy = "any value";
    }

    @PostUpdate
    public void afterUpdate() {

        System.out.println("============ After update =================");

        System.out.println("processing after update logic");
    }

    @PreRemove
    public void beforeDelete() {

        System.out.println("============ Before delete =================");

        System.out.println("processing before delete logic");
    }

    @PostRemove
    public void afterDelete() {

        System.out.println("============ After delete =================");

        System.out.println("processing after delete logic");
    }

    @PostLoad
    public void afterSelect() {

        System.out.println("============ After select =================");

        System.out.println("processing after select logic");

    }

}
