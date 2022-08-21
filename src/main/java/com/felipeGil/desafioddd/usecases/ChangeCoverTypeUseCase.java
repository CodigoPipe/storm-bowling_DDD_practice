package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.felipeGil.desafioddd.domain.ball_design.BallDesing;
import com.felipeGil.desafioddd.domain.ball_design.commands.ChangeCoverType;

public class ChangeCoverTypeUseCase extends UseCase<RequestCommand<ChangeCoverType>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ChangeCoverType> changeCoverTypeRequestCommand) {
        var command = changeCoverTypeRequestCommand.getCommand();
        var ballDesing = BallDesing.from(command.getBallDesingId(),retrieveEvents(command.getBallDesingId().value()));
        ballDesing.changeCoverType(command.getCoverDesingId(), command.getCoverType());
        emit().onResponse(new ResponseEvents(ballDesing.getUncommittedChanges()));
    }

}
