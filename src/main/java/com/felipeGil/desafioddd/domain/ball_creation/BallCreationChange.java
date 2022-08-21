package com.felipeGil.desafioddd.domain.ball_creation;

import co.com.sofka.domain.generic.EventChange;
import com.felipeGil.desafioddd.domain.ball_creation.events.*;
import com.felipeGil.desafioddd.domain.ball_design.ColorDesing;
import com.felipeGil.desafioddd.domain.ball_design.events.ColorDesingAdded;
import com.felipeGil.desafioddd.domain.ball_design.events.ColorNameChanged;
import com.felipeGil.desafioddd.domain.ball_design.events.DensityDecreased;
import com.felipeGil.desafioddd.domain.ball_design.events.EndDateOfBallDesingUpdated;

public class BallCreationChange extends EventChange {

    public BallCreationChange(BallCreation ballCreation) {
        apply((BallCreationCreated event) -> {
            ballCreation.startDate = event.getStartDate();
            ballCreation.endDate = event.getEndDate();
        });


        apply((BallSizeChanged event) -> ballCreation.compactingMachine.changeBallSize(event.getBallSize()));

        apply((CompactingMachineAdded event) -> ballCreation.compactingMachine = new CompactingMachine(event.getCompactingMachineId(), event.getBallSize(), event.getMaterial()));

        apply((DrillingMachineAdded event) -> ballCreation.drillingMachine = new DrillingMachine(event.getDrillingMachineId(), event.getNumerOfHoles(), event.getHoleSize()));

        apply((EmployeeAdded event) -> ballCreation.employee = new Employee(event.getEmployeeId(), event.getName(), event.getMachineInCharge(), event.getSalary()));

        apply((EndDateOfBallCreationUpdated event) -> ballCreation.updateEndDateOfBallCreation(event.getEndDate()));

        apply((HoleSizeDecreased event) -> ballCreation.drillingMachine.decreaseHoleSize(event.getHoleSize()));

        apply((HoleSizeIncreased event) -> ballCreation.drillingMachine.increaseHoleSize(event.getHoleSize()));

        apply((MachineInChargeChanged event) -> ballCreation.employee.changeMachineInCharge(event.getMachineInCharge()));

        apply((MaterialChanged event) -> ballCreation.compactingMachine.changeMaterial(event.getMaterial()));

        apply((NumberOfHolesChanged event) -> ballCreation.drillingMachine.changeNumberOfHoles(event.getNumerOfHoles()));

        apply((SalaryIncreased event) -> ballCreation.employee.increaseSalary(event.getSalary()));

        apply((StartDateOfBallCreationFixed event) -> ballCreation.fixStartDateOfBallCreation(event.getStartDate()));

    }


}
