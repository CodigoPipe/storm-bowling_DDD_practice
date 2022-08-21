package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.felipeGil.desafioddd.domain.ball_design.BallDesing;
import com.felipeGil.desafioddd.domain.ball_design.commands.AddCoverDesing;

public class AddCoverDesingUseCase extends UseCase<RequestCommand<AddCoverDesing>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddCoverDesing> addCoverDesingRequestCommand) {
        var command = addCoverDesingRequestCommand.getCommand();
        var ballDesing = BallDesing.from(command.getBallDesingId(), retrieveEvents(command.getBallDesingId().value()));
        ballDesing.addCoverDesing(command.getEntityId(), command.getCoverType(), command.getResponseTime(), command.getSurface());
        emit().onResponse(new ResponseEvents(ballDesing.getUncommittedChanges()));
    }
}
