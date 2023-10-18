package com.uyoobonga.springmvc.repository;

import com.uyoobonga.springmvc.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRepository extends JpaRepository<Club, Long> {}
