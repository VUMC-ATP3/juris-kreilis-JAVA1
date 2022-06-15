package ckassroomFive.encapsulation;

public class Example {

    public static void main(String[] args) {
        Student myObj = new Student("nikita.milka");
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);

        myObj.hasMood = true;
    }
}
