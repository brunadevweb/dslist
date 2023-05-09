package com.bruna.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruna.dslist.dto.GamesMinDTO;
import com.bruna.dslist.entities.Games;
import com.bruna.dslist.repositories.GamesRepository;

@Service
public class GamesService {
	
	@Autowired
	private GamesRepository gameRepository;
	
	public List<GamesMinDTO> findAll() {
		List<Games> result = gameRepository.findAll();
		return result.stream().map(x -> new GamesMinDTO(x)).toList();

	}
}
