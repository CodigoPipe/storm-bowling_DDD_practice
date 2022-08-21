package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.felipeGil.desafioddd.domain.ball_design.BallDesing;
import com.felipeGil.desafioddd.domain.ball_design.commands.ChangeColorName;

public class ChangeColorNameUseCase extends UseCase<RequestCommand<ChangeColorName>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<ChangeColorName> changeColorNameRequestCommand) {
        var command = changeColorNameRequestCommand.getCommand();
        var ballDesing = BallDesing.from(command.getBallDesingId(),retrieveEvents(command.getBallDesingId().value()));
        ballDesing.changeColorName(command.getColorDesingId(), command.getColorName());
        emit().onResponse(new ResponseEvents(ballDesing.getUncommittedChanges()));
    }

}
