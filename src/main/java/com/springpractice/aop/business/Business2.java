package com.springpractice.aop.business;

import com.springpractice.aop.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public Business2(Dao2 dao2) {
        this.dao2 = dao2;
    }

    public String calculateSomething() {
        String name = dao2.retrieveSomething();
        StringBuilder reverse = new StringBuilder();
        for(int i=name.length()-1; i>=0; i--) {
            reverse.append(name.charAt(i));
        }
        return reverse.toString();
    }
}
