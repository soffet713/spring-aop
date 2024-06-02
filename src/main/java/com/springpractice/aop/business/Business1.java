package com.springpractice.aop.business;

import com.springpractice.aop.aspect.TrackTime;
import com.springpractice.aop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    public Business1(Dao1 dao1) {
        this.dao1 = dao1;
    }

    public String calculateSomething() {
        String name = dao1.retrieveSomething();
        StringBuilder reverse = new StringBuilder();
        for(int i=name.length()-1; i>=0; i--) {
            reverse.append(name.charAt(i));
        }
        return reverse.toString();
    }
}
