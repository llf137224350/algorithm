package com.sjht;

public class Student implements Comparable<Student> {
    public String name;
    public double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student s) {
        if (this.score > s.score) {
            return 1;
        } else if(this.score < s.score) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %s)", this.name, this.score);
    }
}
