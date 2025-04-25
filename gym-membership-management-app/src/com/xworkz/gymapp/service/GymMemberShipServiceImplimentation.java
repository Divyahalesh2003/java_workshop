package com.xworkz.gymapp.service;

import com.xworkz.gymapp.dto.GymMemberShipDetailsDto;
import com.xworkz.gymapp.repository.GymMemberShipRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GymMemberShipServiceImplimentation implements GymMemberShipService{

    private GymMemberShipRepository gymMemberShipRepository;
    @Override
    public boolean validateDto(GymMemberShipDetailsDto dto){
        if(dto!=null){
            System.out.println("dto is not null we can save the data");

            return gymMemberShipRepository.saveDto(dto);
        }
        return true;
    }
    @Override
    public void readDtos(){
        this.gymMemberShipRepository.readDto();
    }
}

