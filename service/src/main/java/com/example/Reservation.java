package com.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by derrickwong on 29/7/2016.
 */

@Data
@Entity
public class Reservation {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String contact;

}
