package com.in.obj;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display(Student s) {
        System.out.println("Student Info: " + s.id + " - " + s.name);
    }

    void show() {
        // 👇 passing current object (this) as argument
        display(this);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Sunny");
        s1.show(); // calls show(), which passes 'this' to display()
    }
}
