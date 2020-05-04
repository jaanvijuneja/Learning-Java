package mysql.project;

import java.util.*;

class Person {

    String name, doj;

    Person() {
    }

    ;
    Person(String name, String doj) {
        this.name = name;
        this.doj = doj;
    }

    public String toString() {
        return "Name: " + name + "\n" + "Date of joining: " + doj;
    }

}

class Student extends Person {

    String dpt, eligible;
    float attendance;

    Student(String dpt, float attendance) {
        this.dpt = dpt;
        this.attendance = attendance;
    }

    void result() {
        if (this.attendance >= 75) {
            eligible = "Yes";
        } else {
            eligible = "No";
        }

    }

    public String toString() {
        return "Department: " + dpt + "\n" + "Eligibilty: " + eligible;
    }

}

class Staff extends Person {

    float oldsalary;

    public Staff() {
    }

    public Staff(float oldsalary) {
        this.oldsalary = oldsalary;
    }

    public String toString() {
        return "Old Salary: " + oldsalary;
    }
}

class Nontechnical extends Staff {

    String dpt;
    float rate, nsalary;

    Nontechnical(String dpt, float rate, float oldsalary) {
        super(oldsalary);
        this.dpt = dpt;
        this.rate = rate;
    }

    void result() {
        float inc = rate / 10;
        nsalary = super.oldsalary * (1 + (inc / 100));
        System.out.println(oldsalary);
        System.out.println(nsalary);
    }

    public String toString() {
        return "Department: " + dpt + "\n" + "New Salary: " + nsalary;
    }

}

class Technical extends Staff {

    String dpt;
    float rate, nsalary;

    Technical(String dpt, float rate, float oldsalary) {
        super(oldsalary);
        this.dpt = dpt;
        this.rate = rate;
    }

    void result() {
        float inc = rate / 10;
        nsalary = super.oldsalary * (1 + (inc / 100));
    }

    public String toString() {
        return "Lab: " + dpt + "\n" + "New Salary: " + nsalary;
    }

}

public class Testinheritance {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String name = s.next();
        String doj = s.next();

        Person p = new Person(name, doj);

        int type = s.nextInt();
        if (type == 1) {
            String dpt = s.next();
            float attendance = s.nextFloat();
            Student s1 = new Student(dpt, attendance);
            s1.result();
            System.out.println(p);
            System.out.println(s1);
        } else if (type == 2) {
            String dpt = s.next();
            float rate = s.nextFloat();
            float osalary = s.nextFloat();
            Staff s2 = new Staff(osalary);
            Nontechnical s1 = new Nontechnical(dpt, rate, osalary);
            s1.result();
            System.out.println(p);
            System.out.println(s2);
            System.out.println(s1);
        } else {
            String dpt = s.next();
            float rate = s.nextFloat();
            float osalary = s.nextFloat();
            Staff s2 = new Staff(osalary);
            Technical s1 = new Technical(dpt, rate, osalary);
            s1.result();
            System.out.println(p);
            System.out.println(s2);
            System.out.println(s1);
        }

    }

}
