package com.mpm.entities.block.unit;

import com.mpm.entities.address.Address;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

public class RoomType {
    private Long id;
    private String name;


    @ManyToMany(mappedBy = "roomTypes", fetch = FetchType.LAZY)
    private Set<Room> roomSet = new HashSet<>();

}
