package ma.enset.escqrsaxon.commands.dtos;

import ma.enset.escqrsaxon.enums.AccountStatus;

public record UpdateAccountStatusRequestDTO(String accountId, AccountStatus status) {
}
