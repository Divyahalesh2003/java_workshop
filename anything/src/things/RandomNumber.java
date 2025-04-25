package com.xworkz.anything.things;

import java.util.Random;

public class RandomNumber {
    public static int getRandomNumber(){
        Random random = new Random();
        int number = random.nextInt(origin:1,bound:100);
    return number;
    }
}
