package com.mpm.entities.address;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Address {
    private Long id;
    private Long cityId;
    private Long stateId;
    private Long countryId;
    private String street;
    private String zipCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "city_id",
            referencedColumnName = "id"
    )
    private City city;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.PERSIST
    )
    @JoinTable(
            name = "address_types",
            joinColumns = {
                    @JoinColumn(
                            name = "address_id",
                            referencedColumnName = "id",
                            nullable = false,
                            updatable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "address_type_id",
                            referencedColumnName = "id",
                            nullable = false,
                            updatable = false
                    )
            }
    )
    private Set<AddressType> addressTypes = new HashSet<>();
}
