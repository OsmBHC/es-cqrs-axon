package ma.enset.escqrsaxon.query.repository;

import ma.enset.escqrsaxon.query.entities.Account;
import ma.enset.escqrsaxon.query.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperationRepository extends JpaRepository<AccountOperation, Long> {
    List<AccountOperation> findByAccountId(String id);
}
