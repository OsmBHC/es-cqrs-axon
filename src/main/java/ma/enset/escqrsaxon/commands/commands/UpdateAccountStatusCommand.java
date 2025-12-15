package ma.enset.escqrsaxon.commands.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.enset.escqrsaxon.enums.AccountStatus;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Getter @AllArgsConstructor
public class UpdateAccountStatusCommand {
    @TargetAggregateIdentifier
    private String id;
    private AccountStatus status;
}
