package EmployWage;

import java.util.Random;

public class UC_5 {


        public static void main(String[] args) {
            Random rand = new Random();
            int rand_int = rand.nextInt(30);
            System.out.println("total work day is "+rand_int);
            if(rand_int>=20)
            {
                System.out.println("salary is cradit total " +rand_int*600);

            }else{
                System.out.println("salary is for LOP hrs "+rand_int*600);
            }
        }

    }
