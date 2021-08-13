package com.mpm.entities.worker;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Worker {
    @Id
    @SequenceGenerator(
            name = "worker_sequence",
            sequenceName = "worker_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "worker_sequence"
    )
    private Long id;
    private Long workerTypeFK;

    @ManyToMany
    @JoinTable(
            name = "specialities_of_workers",
            joinColumns = @JoinColumn(name = "worker_id"),
            inverseJoinColumns = @JoinColumn(name = "specialities_id")
    )


    private Set<Speciality> specialities = new HashSet<>();

}
