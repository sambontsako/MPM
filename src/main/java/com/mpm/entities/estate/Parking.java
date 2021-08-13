package com.mpm.entities.estate;

import com.mpm.entities.block.unit.Unit;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Parking {
    private Long id;
    private Integer number;
    private String name;
    private String colour;
    private String type;
    private String condition;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estate_id", referencedColumnName = "id")
    private Estate estateParking;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    private Unit unitParking;
}
