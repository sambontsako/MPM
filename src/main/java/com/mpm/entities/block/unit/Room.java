package com.mpm.entities.block.unit;

import com.mpm.entities.address.AddressType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Room {
    private Long id;
    private String squareMeterSize;
    private Integer numberOfPlugs;
    private Integer numberOfWindows;
    private String description;
    private Wardrobe wardrobe;
    private Balcony balcony;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    private Unit unitRoom;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.PERSIST
    )
    @JoinTable(
            name = "room_types",
            joinColumns = {
                    @JoinColumn(
                            name = "room_id",
                            referencedColumnName = "id",
                            nullable = false,
                            updatable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "room_type_id",
                            referencedColumnName = "id",
                            nullable = false,
                            updatable = false
                    )
            }
    )
    private Set<RoomType> roomTypes = new HashSet<>();
}
