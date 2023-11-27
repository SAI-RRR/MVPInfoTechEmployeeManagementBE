package com.example.timesheetbe.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
public class Timesheet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private Long empid;


    @Column
    private String name;

    @Column
    private String date;

    @Column
    private String activity;

    @Column
    private int hours;
}
