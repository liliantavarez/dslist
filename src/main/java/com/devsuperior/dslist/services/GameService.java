package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(game -> modelMapper.map(game, GameMinDTO.class)).collect(Collectors.toList());
    }
}


//Camada service é responsável pelas regras de negócios da aplicação!