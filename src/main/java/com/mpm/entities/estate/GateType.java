package com.mpm.entities.estate;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class GateType {
    private Long id;
    private String type;
    private String colour;
    private String condition;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estate_id", referencedColumnName = "id")
    private Estate estate;
}
