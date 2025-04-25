package com.xworkz.gymapp.runner;

import com.xworkz.gymapp.constant.MemberShipType;
import com.xworkz.gymapp.dto.GymMemberShipDetailsDto;
import com.xworkz.gymapp.repository.GymMemberShipRepositoryImpl;
import com.xworkz.gymapp.repository.GymMemberShipRepository;
import com.xworkz.gymapp.service.GymMemberShipService;
import com.xworkz.gymapp.service.GymMemberShipServiceImplimentation;

public class GymMemberShipRunner {
    public static void main(String[] args) {
        GymMemberShipDetailsDto dto = new GymMemberShipDetailsDto();
        dto.setMemberId(1);
        dto.setMemberName("Divya");
        dto.setMemberEmailId("divyahalesh2003@gmail.com");
        dto.setMemberShipType(MemberShipType.DAILY);
        System.out.println(dto.getMemberId());
        System.out.println(dto.getMemberName());
        System.out.println(dto.getMemberEmailId());
        System.out.println(dto.getClass());
        System.out.println(dto.toString());
        GymMemberShipRepository gymMemberShipRepository = new GymMemberShipRepositoryImpl();
        GymMemberShipService service = new GymMemberShipServiceImplimentation(gymMemberShipRepository);
        System.out.println("invoking");
        service.validateDto(dto);
        System.out.println("invoking");
        service.validateDto(dto);
        System.out.println("invoking");
        service.validateDto(dto);
        System.out.println("");
        service.readDtos();
            }
        }




