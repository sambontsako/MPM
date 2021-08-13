package com.mpm.entities.user;

import com.mpm.entities.Audit;
import com.mpm.entities.estate.Estate;

import javax.persistence.*;

public class Role extends Audit {
    @Id
    @SequenceGenerator(
            name = "role_sequence",
            sequenceName = "role_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "role_sequence"
    )
    private Long id;
    private String Description;
    private Integer level;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User userRole;
}
