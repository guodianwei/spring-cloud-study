package com.tianhe.cw.provider.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tianhe.cw.provider.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
