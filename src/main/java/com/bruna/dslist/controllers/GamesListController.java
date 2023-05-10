package com.bruna.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruna.dslist.dto.GamesListDTO;
import com.bruna.dslist.services.GamesListService;

@RestController
@RequestMapping(value = "/lists")
public class GamesListController {
	
	@Autowired
	private GamesListService gamesListService;
	
	
	@GetMapping
	public List<GamesListDTO> findAll() {
		List<GamesListDTO> result = gamesListService.findAll();
		return result;
	}

}
