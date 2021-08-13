package com.mpm.entities.block;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mpm.entities.block.unit.Kitchen;
import com.mpm.entities.block.unit.Unit;
import com.mpm.entities.estate.Estate;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AreaBlock {
    private Long id;
    private String name;
    private Integer blockNumber;
    private String colour;
    private Integer numberOfFloors;
    private Integer numberOfUnits;
    private List<Unit> units;

    @OneToOne(
            mappedBy = "area_block",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private Estate estate;

    @JsonIgnore
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "areaBlockUnit"
    )
    private Set<Unit> unitAreaBlock = new HashSet<>();
}
