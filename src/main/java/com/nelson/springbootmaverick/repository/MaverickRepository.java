package com.nelson.springbootmaverick.repository;

import com.nelson.springbootmaverick.model.Maverick;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MaverickRepository extends JpaRepository<Maverick, Long> {

    Optional<Maverick> findByName(String subredditName);
}
