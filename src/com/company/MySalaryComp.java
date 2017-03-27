package com.company;

import java.util.Comparator;

/**
 * Created by Sanjar on 27.03.2017.
 */
public class MySalaryComp implements Comparator<Empl> {
    @Override
    public int compare(Empl e1, Empl e2){

        int s1 = e1.getSalary();
        int s2 = e2.getSalary();

        if(s1 > s2){
            return -1;
        }else if(s1 < s2){
            return 1;
        }

        return 0;
    }
}
