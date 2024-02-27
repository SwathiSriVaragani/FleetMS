package com.swathi.FleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swathi.FleetApp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
