package com.swathi.FleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swathi.FleetApp.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
