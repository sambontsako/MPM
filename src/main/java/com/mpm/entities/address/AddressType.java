package com.mpm.entities.address;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

public class AddressType {
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "addressTypes", fetch = FetchType.LAZY)
    private Set<Address> addressSet = new HashSet<>();
}
