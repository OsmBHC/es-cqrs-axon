package ma.enset.escqrsaxon.query.handlers;

import ma.enset.escqrsaxon.query.entities.Account;
import ma.enset.escqrsaxon.query.queries.GetAllAccountsQuery;
import ma.enset.escqrsaxon.query.repository.AccountRepository;
import ma.enset.escqrsaxon.query.repository.OperationRepository;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountQueryHandler {
    private AccountRepository accountRepository;
    private OperationRepository operationRepository;

    public AccountQueryHandler(AccountRepository accountRepository, OperationRepository operationRepository) {
        this.accountRepository = accountRepository;
        this.operationRepository = operationRepository;
    }

    @QueryHandler
    public List<Account> on(GetAllAccountsQuery query){
        return accountRepository.findAll();
    }
}
