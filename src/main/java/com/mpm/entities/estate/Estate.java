package com.mpm.entities.estate;

import com.mpm.entities.block.AreaBlock;
import com.mpm.entities.security.Security;
import com.mpm.entities.block.unit.Unit;
import com.mpm.entities.worker.Worker;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Estate {
    private Long id;
    private Long addressFK;
    private Long estateTypeFK;
    private Long estateStatusFK;
    private Long gateTypeFK;
    private Integer totalParking;
    private Boolean isElectricFaced;

    private List<Worker> workerjs;
    private List<Parking> parkings;
    private List<AreaBlock> areaBlocks;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "area_block_id", nullable = false)
    private AreaBlock areaBlock;


    private Set<Security> securities = new HashSet<>();


}
