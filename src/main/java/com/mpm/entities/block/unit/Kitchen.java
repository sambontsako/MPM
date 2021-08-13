package com.mpm.entities.block.unit;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Kitchen {
    private Long id;
    private Integer kitchenSize;
    private Boolean haveStove;
    private Boolean haveKitchenUnit;
    private Boolean haveOven;
    private Boolean havePlugs;
    private Boolean haveWashingSpace;
    private Boolean haveFridgeSpace;
    private Boolean haveMicrowaveSpace;
    private Boolean haveDishWasherSpace;
    private Boolean isMainKitchen;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    private Unit unitKitchen;
}
