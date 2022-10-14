package EmployWage;

import java.util.Random;

public class UC_6 {

        public static void main(String[] args) {
            Random hour = new Random();
            int rand_int = hour.nextInt(12*10);
            System.out.println("total work hours is "+rand_int);

            if(rand_int>=100)
            {
                System.out.println("total one month working hour is " +rand_int );
                System.out.println("total work day is "+rand_int/5);

            }else{
                System.out.println("Not work one month");
                System.out.println("total work day is "+rand_int/5);
            }
        }

    }
