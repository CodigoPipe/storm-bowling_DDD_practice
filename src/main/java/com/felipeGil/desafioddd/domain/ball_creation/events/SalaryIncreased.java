package com.felipeGil.desafioddd.domain.ball_creation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_creation.values.EmployeeId;
import com.felipeGil.desafioddd.domain.ball_creation.values.Salary;

public class SalaryIncreased extends DomainEvent {

    private final EmployeeId employeeId;

    private final Salary salary;

    public SalaryIncreased(EmployeeId employeeId, Salary salary) {
        super("FelipeGil.BallCreation.SalaryIncreased");
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public Salary getSalary() {
        return salary;
    }
}
