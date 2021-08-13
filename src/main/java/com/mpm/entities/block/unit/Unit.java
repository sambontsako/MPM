package com.mpm.entities.block.unit;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mpm.entities.block.AreaBlock;
import com.mpm.entities.estate.Estate;
import com.mpm.entities.user.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Unit {
    @Id
    @SequenceGenerator(
            name = "unit_sequence",
            sequenceName = "unit_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "unit_sequence"
    )
    private Long id;

    private Long unitTypeFK;
    private Long electricityTypeFK;
    private Integer unitNumber;
    private String floorLevel;
    private String colour;
    private String squareMeterSize;

    @JsonIgnore
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "unitGeyser"
    )
    private Set<Geyser> geysers = new HashSet<>();

    @JsonIgnore
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "unitRoom"
    )
    private Set<Room> rooms = new HashSet<>();

    @JsonIgnore
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "unitKitchen"
    )
    private Set<Kitchen> kitchens = new HashSet<>();

    @OneToOne(
            mappedBy = "unitElectricityType",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private ElectricityType electricityType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    private AreaBlock areaBlockUnit;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    private User userUnit;
}
