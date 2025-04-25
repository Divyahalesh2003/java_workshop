package com.xworks.meetup.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
@Getter
@Setter
@ToString
public class MeetupDetailsDto {
    private String date;
    private String Time;
    private String personName;
    private String place;
    private String gift;
    private LocalDateTime createdOn;
    private String createdBy;
    private LocalDateTime updatedOn;
    private String updateBy;

}
