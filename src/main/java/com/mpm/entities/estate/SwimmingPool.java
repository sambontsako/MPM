package com.mpm.entities.estate;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class SwimmingPool {
    private Long id;
    private String size;
    private String name;
    private String description;
    private String condition;
    private Access access;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estate_id", referencedColumnName = "id")
    private Estate estateSwimmingPool;
}
