package com.mpm.entities.block.unit;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Balcony {
    private Long id;
    private Integer size;
    private Integer numberOfPlugs;
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    private Unit unitBalcony;
}
