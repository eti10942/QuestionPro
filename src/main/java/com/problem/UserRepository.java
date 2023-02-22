package com.problem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.problem.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
