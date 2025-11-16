package com.ttn.ck.helper;

import com.ttn.ck.dto.Employee;

public class EmployeeHelper {
    public static Employee getEmp1(){

        return Employee.builder().id(1)
                .name("Rohit")
                .dept("tuner")
                .build();
    }

    public static Employee getEmp2(){
        return Employee.builder().id(2)
                .name("Abhi")
                .dept("tuner")
                .build();
    }

    public static Employee getEmp3(){
        return Employee.builder().id(3)
                .name("Mohit")
                .dept("tuner")
                .build();
    }

    public static Employee getEmp4(){
        return Employee.builder().id(4)
                .name("Bhavya")
                .dept("tuner")
                .build();
    }
    public static Employee getEmp5(){
        return Employee.builder().id(5)
                .name("Lalit")
                .dept("tuner")
                .build();
    }
}
