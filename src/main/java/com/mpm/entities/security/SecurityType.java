package com.mpm.entities.security;

import java.util.HashSet;
import java.util.Set;

public class SecurityType {
    private Long id;
    private String type;

    private Set<Security> securities = new HashSet<>();
}
