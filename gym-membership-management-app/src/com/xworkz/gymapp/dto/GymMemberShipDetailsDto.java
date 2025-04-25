package com.xworkz.gymapp.dto;

import com.xworkz.gymapp.constant.MemberShipType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;
@Setter
@Getter
@ToString
public class GymMemberShipDetailsDto {
    //properties or instance variables
    private int memberId;
    private String memberName;
    private String memberEmailId;
    private long contactNumber;
    private LocalDate issuedDate;
    private LocalTime issueTime;
    private LocalDate expDate;
    private MemberShipType memberShipType;

}
