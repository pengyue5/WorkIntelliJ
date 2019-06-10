package com.wpy.cloud.microserviceprovideruser.dao;

import com.wpy.cloud.microserviceprovideruser.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
