package com.example.petplan.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "walks")
public class Walk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Column(name = "walk_date")
    private LocalDate walkDate;

    @Column(name = "walker_name")
    private String walkerName;

    @Column(name = "pet_name")
    private String petName;

    @Column(name = "went_to_bathroom")
    private boolean wentToBathroom;

    public Walk() {}

    public Walk(LocalTime startTime, LocalTime endTime, LocalDate walkDate, String walkerName, String petName, boolean wentToBathroom) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.walkDate = walkDate;
        this.walkerName = walkerName;
        this.petName = petName;
        this.wentToBathroom = wentToBathroom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalDate getWalkDate() {
        return walkDate;
    }

    public void setWalkDate(LocalDate walkDate) {
        this.walkDate = walkDate;
    }

    public String getWalkerName() {
        return walkerName;
    }

    public void setWalkerName(String walkerName) {
        this.walkerName = walkerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public boolean isWentToBathroom() {
        return wentToBathroom;
    }

    public void setWentToBathroom(boolean wentToBathroom) {
        this.wentToBathroom = wentToBathroom;
    }
}
