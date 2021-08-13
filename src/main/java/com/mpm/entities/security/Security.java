package com.mpm.entities.security;

import com.mpm.entities.estate.Estate;

import java.util.HashSet;
import java.util.Set;

public class Security {
    private Long id;
    private Long securityTypeFK;
    private String companyName;

    private Set<SecurityType> securityTypes = new HashSet<>();

    private Set<Estate> estatesSecurity = new HashSet<>();


}
