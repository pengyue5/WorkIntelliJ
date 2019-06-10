package com.wpy.cloud.microservicesimpleprovideruser.dao;

import com.wpy.cloud.microservicesimpleprovideruser.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
