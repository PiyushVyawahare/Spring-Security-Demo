package com.vyawpiy.Spring_Security_Demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int rollNo;
    private String name;
    private int marks;
}
