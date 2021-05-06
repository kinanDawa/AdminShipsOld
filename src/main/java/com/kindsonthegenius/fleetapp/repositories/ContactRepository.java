package com.kindsonthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetapp.models.Client;

public interface ContactRepository extends JpaRepository<contact, Integer> {

}
