package com.felipeGil.desafioddd.domain.ball_creation.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_creation.values.*;

public class AddEmployee extends Command {

    private final BallCreationId ballCreationId;

    private final EmployeeId employeeId;

    private final Name name;

    private final MachineInCharge machineInCharge;

    private final Salary salary;

    public AddEmployee(BallCreationId ballCreationId, EmployeeId employeeId, Name name, MachineInCharge machineInCharge, Salary salary) {
        this.ballCreationId = ballCreationId;
        this.employeeId = employeeId;
        this.name = name;
        this.machineInCharge = machineInCharge;
        this.salary = salary;
    }

    public BallCreationId getBallCreationId() {
        return ballCreationId;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public Name getName() {
        return name;
    }

    public MachineInCharge getMachineInCharge() {
        return machineInCharge;
    }

    public Salary getSalary() {
        return salary;
    }
}
