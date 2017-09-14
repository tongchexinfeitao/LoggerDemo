package com.example.loggerdemo;

/**
 * Created by hasee on 2017/9/14.
 */

public class Person {
    String name;
    String gender;
    Job job;

    public Person(String name, String gender, Job job) {
        this.name = name;
        this.gender = gender;
        this.job = job;
    }

    static class Job {
        String workName;
        String workLocation;

        public Job(String workName, String workLocation) {
            this.workName = workName;
            this.workLocation = workLocation;
        }

        @Override
        public String toString() {
            return "Job{" +
                    "workName='" + workName + '\'' +
                    ", workLocation='" + workLocation + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", job=" + job +
                '}';
    }
}
