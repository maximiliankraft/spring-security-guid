package at.maxkraft.restsec;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PermissionRepository extends CrudRepository<Permission, Long> {

    Optional<Permission> findByClassNameAndNameAndUser(String className, String permissionName ,UserEntity user);
    Optional<Permission> findByClassNameAndNameAndUserAndObjectId(
            String className,
            String permissionName ,
            UserEntity user,
            Long objectId
    );

}
