package com.felipeGil.desafioddd.domain.ball_creation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_creation.values.EmployeeId;
import com.felipeGil.desafioddd.domain.ball_creation.values.MachineInCharge;

public class MachineInChargeChanged extends DomainEvent {

    private final EmployeeId employeeId;

    private final MachineInCharge machineInCharge;

    public MachineInChargeChanged(EmployeeId employeeId, MachineInCharge machineInCharge) {
        super("FelipeGil.BallCreation.MachineInChargeChanged");
        this.employeeId = employeeId;
        this.machineInCharge = machineInCharge;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public MachineInCharge getMachineInCharge() {
        return machineInCharge;
    }
}
