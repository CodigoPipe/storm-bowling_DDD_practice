package com.felipeGil.desafioddd.domain.ball_creation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_creation.values.EmployeeId;
import com.felipeGil.desafioddd.domain.ball_creation.values.MachineInCharge;
import com.felipeGil.desafioddd.domain.ball_creation.values.Name;
import com.felipeGil.desafioddd.domain.ball_creation.values.Salary;

public class EmployeeAdded extends DomainEvent {

    private final EmployeeId employeeId;

    private final Name name;

    private final MachineInCharge machineInCharge;

    private final Salary salary;

    public EmployeeAdded(EmployeeId employeeId, Name name, MachineInCharge machineInCharge, Salary salary) {
        super("FelipeGil.BallCreation.EmployeeAdded");
        this.employeeId = employeeId;
        this.name = name;
        this.machineInCharge = machineInCharge;
        this.salary = salary;
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
