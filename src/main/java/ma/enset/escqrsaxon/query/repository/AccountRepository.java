package ma.enset.escqrsaxon.query.repository;

import ma.enset.escqrsaxon.query.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
