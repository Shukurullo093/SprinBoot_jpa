package com.test.sprinboot_jpa.Talaba_malumotlari;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @OneToOne
    Manzil manzil;

    @ManyToMany
    List<Fanlar> fanlarList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String ismi;

    @Column(nullable = false)
    private String familyasi;

    @Column(nullable = false , unique = true)
    private String tel_raqami;
}
