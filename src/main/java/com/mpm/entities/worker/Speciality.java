package com.mpm.entities.worker;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Speciality {
    private Long id;
    private String name;
    private String description;
    private Integer numberOfExperience;
    private LocalDate enrolledDate;

    @JsonIgnore
    @ManyToMany(mappedBy = "specialities")
    Set<Worker> workersList = new HashSet<>();
}
