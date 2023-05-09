package com.bruna.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruna.dslist.dto.GamesMinDTO;
import com.bruna.dslist.services.GamesService;

@RestController
@RequestMapping(value = "/games")
public class GamesController {
	
	@Autowired
	private GamesService gamesService;
	
	@GetMapping
	public List<GamesMinDTO> findAll() {
		List<GamesMinDTO> result = gamesService.findAll();
		return result;
		
	}

}
