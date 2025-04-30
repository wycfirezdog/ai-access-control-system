package com.sharath.aiaccess.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter@Setter
@NoArgsConstructor @AllArgsConstructor
public class Role{
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(nullable = false , unique = true)
 private String name;

}