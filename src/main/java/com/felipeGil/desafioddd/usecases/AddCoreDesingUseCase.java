package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.felipeGil.desafioddd.domain.ball_design.BallDesing;
import com.felipeGil.desafioddd.domain.ball_design.commands.AddCoreDesing;

public class AddCoreDesingUseCase extends UseCase<RequestCommand<AddCoreDesing>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AddCoreDesing> addCoreDesingRequestCommand) {
        var command = addCoreDesingRequestCommand.getCommand();
        var ballDesing = BallDesing.from(command.getBallDesingId(), retrieveEvents(command.getBallDesingId().value()));
        ballDesing.addCoreDesing(command.getEntityId(), command.getCoreType(), command.getCoreSize());
        emit().onResponse(new ResponseEvents(ballDesing.getUncommittedChanges()));
    }

}
