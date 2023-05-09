package com.bruna.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruna.dslist.entities.Games;

public interface GamesRepository extends JpaRepository<Games, Long> {

}
