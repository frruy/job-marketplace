package org.duyphung.jobmarketplace.repositories;

import org.duyphung.jobmarketplace.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findUserByEmail(String email);

    UserEntity findUserByUserName(String name);

    UserEntity findUserById(Integer id);
}
