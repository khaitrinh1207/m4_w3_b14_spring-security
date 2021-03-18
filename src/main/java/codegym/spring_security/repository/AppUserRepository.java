package codegym.spring_security.repository;

import codegym.spring_security.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Long> {
    AppUser getAppUserByUsername(String name);
}
