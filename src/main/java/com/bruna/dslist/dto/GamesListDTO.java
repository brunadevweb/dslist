package com.bruna.dslist.dto;

import com.bruna.dslist.entities.GamesList;

public class GamesListDTO {
	
	private Long id;
	private String name;
	
	public GamesListDTO() {
	}

	public GamesListDTO(GamesList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
