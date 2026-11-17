package assignment3;

import java.util.Scanner;

class Student {
    String usn;
    String name;
    String branch;
    String phone;

    Student(String usn, String name, String branch, String phone) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Phone: " + phone);
        System.out.println("----------------------");
    }
}

public class StudentAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Student " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Branch: ");
            String branch = sc.next();

            System.out.print("Phone: ");
            String phone = sc.next();

            students[i] = new Student(usn, name, branch, phone);
        }

        System.out.println("\nSTUDENT DETAILS");

        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}