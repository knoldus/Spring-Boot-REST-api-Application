package com.knoldus.springBootApi.currentTime.service;


import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Project : spring-boot-REST-api-example
 * Created by IntelliJ IDEA.
 * User: shashikant
 * Date: 22/06/2022
*/
@Service
public class CurrentDateTime {

                public static final long MSEC_SINCE_EPOCH = System.currentTimeMillis();

                public String getTimeStatus(){

                        Date c_date = new Date( MSEC_SINCE_EPOCH );

                        // Set up a simple date format
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "HH:mm aa" );

                        // Set the time format that we would require
                        String current_time = simpleDateFormat.format( c_date );

                        return "Current Running Time:, "+ current_time;
                }
}
