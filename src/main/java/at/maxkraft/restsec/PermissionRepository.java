package at.maxkraft.restsec;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PermissionRepository extends CrudRepository<Permission, Long> {

    // Optional<Permission> findByClassNameAndNameAndUserEntity...()

}
