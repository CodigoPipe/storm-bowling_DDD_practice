package com.felipeGil.desafioddd.domain.ball_creation.commands;

import co.com.sofka.domain.generic.Command;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.ball_creation.values.EmployeeId;
import com.felipeGil.desafioddd.domain.ball_creation.values.Salary;

public class IncreaseSalary extends Command {

    private final BallCreationId ballCreationId;

    private final EmployeeId employeeId;

    private final Salary salary;

    public IncreaseSalary(BallCreationId ballCreationId, EmployeeId employeeId, Salary salary) {
        this.ballCreationId = ballCreationId;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public BallCreationId getBallCreationId() {
        return ballCreationId;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public Salary getSalary() {
        return salary;
    }
}
