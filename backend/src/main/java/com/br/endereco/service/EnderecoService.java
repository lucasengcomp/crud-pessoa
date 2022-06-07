package com.br.endereco.service;

import com.br.core.exceptions.service.ResourceNotFoundException;
import com.br.endereco.model.Endereco;
import com.br.endereco.model.dto.EnderecoDTO;
import com.br.endereco.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    @Transactional
    public EnderecoDTO findById(Long id) {
        Optional<Endereco> cfopById = repository.findById(id);
        Endereco entity = cfopById.orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado para o id informado"));
        return new EnderecoDTO(entity);
    }
}
