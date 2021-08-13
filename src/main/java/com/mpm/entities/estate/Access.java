package com.mpm.entities.estate;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class Access {
    private Long id;
    private String type;
    private String description;
    private LocalDate openTime;
    private LocalDate closeTime;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gateType_id", referencedColumnName = "id")
    private GateType gateTypeAccess;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "swimmingPool_id", referencedColumnName = "id")
    private SwimmingPool swimmingPoolAccess;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gym_id", referencedColumnName = "id")
    private Gym gym;
}
