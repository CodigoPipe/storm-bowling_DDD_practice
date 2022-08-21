package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.felipeGil.desafioddd.domain.ball_design.BallDesing;
import com.felipeGil.desafioddd.domain.ball_design.commands.AddColorDesing;

public class AddColorDesingUseCase extends UseCase<RequestCommand<AddColorDesing>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddColorDesing> addColorDesingRequestCommand) {
        var command = addColorDesingRequestCommand.getCommand();
        var ballDesing = BallDesing.from(command.getBallDesingId(), retrieveEvents(command.getBallDesingId().value()));
        ballDesing.addColorDesing(command.getEntityId(), command.getColorName(), command.getDensity());
        emit().onResponse(new ResponseEvents(ballDesing.getUncommittedChanges()));
    }

}
