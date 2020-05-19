package com.security.demoSecurity.student;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"Sammi ALdhi Yanto"),
            new Student(2,"Ayatullah"),
            new Student(3,"Adit")
    );

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN,ROLE_ADMINTRAINEE')")
    public List<Student> getAllStudent(){
        System.out.println("get all students");
        return STUDENTS;
    }

    @PostMapping
    public void insertStudent(@RequestBody Student student){
        System.out.println("insertStudent");
        System.out.println(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println("deleteStudent");
        System.out.println(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId, Student student){
        System.out.println("updateStudent");
        System.out.println(String.format("%s %s",studentId,student));
    }
}
