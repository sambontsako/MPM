package com.mpm.entities.block.unit;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class ElectricityType {
    private Long id;
    private String name;

    @OneToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name = "unit_id",
            nullable = false
    )
    private Unit unitElectricityType;
}
