package com.felipeGil.desafioddd.domain.ball_creation;

import co.com.sofka.domain.generic.Entity;
import com.felipeGil.desafioddd.domain.ball_creation.values.EmployeeId;
import com.felipeGil.desafioddd.domain.ball_creation.values.MachineInCharge;
import com.felipeGil.desafioddd.domain.ball_creation.values.Name;
import com.felipeGil.desafioddd.domain.ball_creation.values.Salary;

import java.util.Objects;

public class Employee extends Entity<EmployeeId> {


    private Name name;

    private MachineInCharge machineInCharge;

    private Salary salary;

    public Employee(EmployeeId entityId, Name name, MachineInCharge machineInCharge, Salary salary) {
        super(entityId);
        this.name = name;
        this.machineInCharge = machineInCharge;
        this.salary = salary;
    }

    public void changeMachineInCharge(MachineInCharge machineInCharge){
        this.machineInCharge = Objects.requireNonNull(machineInCharge);
    }

    public void increaseSalary(Salary salary){
        this.salary = Objects.requireNonNull(salary);
    }

    public Name name(){
        return name;
    }

    public MachineInCharge machineInCharge(){
        return machineInCharge;
    }

    public Salary salary(){
        return salary;
    }


}
