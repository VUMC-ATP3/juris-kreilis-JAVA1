package ckassroomFive.exercises;

public class Employee {
    int salary = 100;

    public int incSalary(int percent){
        this.salary = salary + (salary * (percent/100));
        return this.salary;
    }
}
