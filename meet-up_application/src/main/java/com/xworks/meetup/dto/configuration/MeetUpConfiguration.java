package com.xworks.meetup.dto.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xeorkz")

public class MeetUpConfiguration  implements WebMvcConfigurer {
    public MeetUpConfiguration(){
        System.out.println("MeetUpConfiguration created");
    }

}
