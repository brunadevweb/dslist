package com.bruna.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruna.dslist.entities.GamesList;

public interface GamesListRepository extends JpaRepository<GamesList, Long> {

}
