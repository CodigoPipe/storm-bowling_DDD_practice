package com.felipeGil.desafioddd.domain.ball_creation;

import co.com.sofka.domain.generic.Entity;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallSize;
import com.felipeGil.desafioddd.domain.ball_creation.values.CompactingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.EmployeeId;
import com.felipeGil.desafioddd.domain.ball_creation.values.Material;

import java.util.Objects;

public class CompactingMachine extends Entity<CompactingMachineId> {

    private BallSize ballSize;

    private Material material;

    private EmployeeId compactingMachineEmployeeId;

    public CompactingMachine(CompactingMachineId entityId, BallSize ballSize, Material material) {
        super(entityId);
        this.ballSize = ballSize;
        this.material = material;
    }

    public void addEmployeeInCharge(EmployeeId employeeId){
        this.compactingMachineEmployeeId = Objects.requireNonNull(employeeId);
    }

    public void changeMaterial(Material material){
        this.material = Objects.requireNonNull(material);
    }

    public void changeBallSize(BallSize ballSize){
        this.ballSize = Objects.requireNonNull(ballSize);
    }


    public BallSize BallSize() {
        return ballSize;
    }

    public Material Material() {
        return material;
    }

    public EmployeeId CompactingMachineEmployeeId() {
        return compactingMachineEmployeeId;
    }
}
