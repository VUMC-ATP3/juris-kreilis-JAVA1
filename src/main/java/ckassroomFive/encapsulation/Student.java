package ckassroomFive.encapsulation;

public class Student extends Person {

    public int graduationYear = 2018;
    private String mailDomain = "@lu.lv";

    public Student(String accountName) {
        mailDomain = accountName + mailDomain;
    }

    public String getMailDomain() {
        return mailDomain;
    }
}
