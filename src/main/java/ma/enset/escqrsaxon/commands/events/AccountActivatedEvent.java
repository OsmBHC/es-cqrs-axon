package ma.enset.escqrsaxon.commands.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.enset.escqrsaxon.enums.AccountStatus;

@Getter @AllArgsConstructor
public class AccountActivatedEvent {
    private String accountId;
    private AccountStatus status;
}
