package com.excel.proj.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "BOOK")
@Data
public class BookEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;
}
