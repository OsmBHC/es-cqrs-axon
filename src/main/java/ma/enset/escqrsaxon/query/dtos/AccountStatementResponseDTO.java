package ma.enset.escqrsaxon.query.dtos;

import ma.enset.escqrsaxon.query.entities.Account;
import ma.enset.escqrsaxon.query.entities.AccountOperation;

import java.util.List;

public record AccountStatementResponseDTO(Account account, List<AccountOperation> operations) {
}
