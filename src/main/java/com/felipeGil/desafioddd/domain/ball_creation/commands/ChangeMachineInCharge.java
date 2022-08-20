package com.felipeGil.desafioddd.domain.ball_creation.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.ball_creation.values.EmployeeId;
import com.felipeGil.desafioddd.domain.ball_creation.values.MachineInCharge;

public class ChangeMachineInCharge extends Command {

    private final BallCreationId ballCreationId;

    private final EmployeeId employeeId;

    private final MachineInCharge machineInCharge;

    public ChangeMachineInCharge(BallCreationId ballCreationId, EmployeeId employeeId, MachineInCharge machineInCharge) {
        this.ballCreationId = ballCreationId;
        this.employeeId = employeeId;
        this.machineInCharge = machineInCharge;
    }

    public BallCreationId getBallCreationId() {
        return ballCreationId;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public MachineInCharge getMachineInCharge() {
        return machineInCharge;
    }
}
