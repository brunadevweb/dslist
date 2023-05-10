package com.bruna.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruna.dslist.dto.GamesListDTO;
import com.bruna.dslist.entities.GamesList;
import com.bruna.dslist.repositories.GamesListRepository;

@Service
public class GamesListService {
	
	@Autowired
	private GamesListRepository gamesListRepository;
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<GamesListDTO> findAll() {
		List<GamesList> result = gamesListRepository.findAll();
		return result.stream().map(x -> new GamesListDTO(x)).toList();
	}
}
