package com.bruna.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruna.dslist.dto.GamesListDTO;
import com.bruna.dslist.dto.GamesMinDTO;
import com.bruna.dslist.services.GamesListService;
import com.bruna.dslist.services.GamesService;

@RestController
@RequestMapping(value = "/lists")
public class GamesListController {
	
	@Autowired
	private GamesListService gamesListService;
	
	@Autowired
	private GamesService gamesService;
	
	
	@GetMapping
	public List<GamesListDTO> findAll() {
		List<GamesListDTO> result = gamesListService.findAll();
		return result;
	}

	@GetMapping(value = "/{listId}/games")
	public List<GamesMinDTO> findByList(@PathVariable Long listId) {
		List<GamesMinDTO> result = gamesService.findByList(listId);
		return result;
	}
}
