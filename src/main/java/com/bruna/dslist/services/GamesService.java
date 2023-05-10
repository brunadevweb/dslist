package com.bruna.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.bruna.dslist.dto.GamesDTO;
import com.bruna.dslist.dto.GamesMinDTO;
import com.bruna.dslist.entities.Games;
import com.bruna.dslist.repositories.GamesRepository;

@Service
public class GamesService {
	
	@Autowired
	private GamesRepository gameRepository;
	
	public class NotFoundException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		public NotFoundException(String message) {
	        super(message);
	    }
	}

	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public GamesDTO findById(Long id) {
		try {
			Games result = gameRepository.findById(id).get();
			return new GamesDTO(result);
		} catch (EmptyResultDataAccessException ex) {
	        throw new NotFoundException ("Game not found with ID: " + id);
		}
		
	}

	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<GamesMinDTO> findAll() {
		List<Games> result = gameRepository.findAll();
		return result.stream().map(x -> new GamesMinDTO(x)).toList();
	}
}
