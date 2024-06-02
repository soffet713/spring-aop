package com.springpractice.aop.data;

import com.springpractice.aop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    public String retrieveSomething() {
        return "Dao1";
    }
}
