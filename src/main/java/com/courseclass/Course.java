/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.courseclass;

/**
 *
 * @author ASUS
 */
public class Course {
    private String mapel;
    private String courseID;

    public Course(String mapel, String courseID) {
        this.mapel = mapel;
        this.courseID = courseID;
    }
    public void learn(){
        System.out.println("saya belajar");
    }
}
