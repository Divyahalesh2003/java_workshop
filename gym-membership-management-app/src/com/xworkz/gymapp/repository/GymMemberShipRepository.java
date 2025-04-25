package com.xworkz.gymapp.repository;

import com.xworkz.gymapp.dto.GymMemberShipDetailsDto;

public interface GymMemberShipRepository {
    boolean saveDto(GymMemberShipDetailsDto dto);
    void readDto();
}
