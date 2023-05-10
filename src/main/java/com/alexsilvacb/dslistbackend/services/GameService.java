package com.alexsilvacb.dslistbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexsilvacb.dslistbackend.dto.GameDTO;
import com.alexsilvacb.dslistbackend.dto.GameMinDTO;
import com.alexsilvacb.dslistbackend.entities.Game;
import com.alexsilvacb.dslistbackend.projections.GameMinProjection;
import com.alexsilvacb.dslistbackend.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long ListId){
		List<GameMinProjection> result = gameRepository.searchByList(ListId);
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
}
