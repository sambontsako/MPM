package com.mpm.entities.block.unit;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class Geyser {
    private Long id;
    private Integer numberOfLiters;
    private String name;
    private String description;
    private LocalDate installedDate;
    private String condition;
    private String location;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    private Unit unitGeyser;
}
