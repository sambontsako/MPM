package com.mpm.entities.block.unit;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Wardrobe {
    private Long id;
    private Integer size;
    private String colour;
    private Boolean onWall;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    private Unit unit;
}
