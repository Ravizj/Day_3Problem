package EmployWage;


public class UC1 {

    public static void main(String[] args) {
        double empcheck = Math.floor(Math.random()*10%2);
        System.out.println(empcheck);
        if(empcheck==1) {
            System.out.println("emploey is persent");

        }else{
            System.out.println("employe is absent");
        }
    }

}