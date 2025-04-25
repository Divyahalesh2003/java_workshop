package com.xworkz.gymapp.repository;

import com.xworkz.gymapp.dto.GymMemberShipDetailsDto;

import java.util.Arrays;

public class GymMemberShipRepositoryImpl implements GymMemberShipRepository {
    private  GymMemberShipDetailsDto[] listOfDtos = new GymMemberShipDetailsDto[2];
    private int index = 0;
    @Override
    public boolean saveDto(GymMemberShipDetailsDto dto){
        System.out.println("invoking the GymMemberShipRepositoryImp()");
        System.out.println("dto is:"+dto);
        if(this.index < listOfDtos.length){
            listOfDtos[this.index] = dto;
            this.index++;
            System.out.println("saved succssfully");
            return true;
        }else{
            System.out.println("check array length is Full");
        }
        return false;

}

    @Override
    public void readDto() {
        System.out.println(Arrays.toString(listOfDtos));

    }

}
