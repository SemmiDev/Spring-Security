package com.security.demoSecurity.student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

//@AllArgsConstructor
//@Getter
//@ToString
public class Student {

    private final Integer studentId;
    private final String studentName;

    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
