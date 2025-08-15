package br.com.fiap.ovnis.service;

import java.util.List;
import java.util.Optional;

import br.com.fiap.ovnis.repository.OvnisRepository;
import org.springframework.stereotype.Service;

import br.com.fiap.ovnis.model.Ovnis;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OvnisService {
    private final OvnisRepository repository;

    public List<Ovnis> getAll() {
        return repository.findAll();
    }

    public Ovnis save(Ovnis sighting) {
        return repository.save(sighting);
    }

    public Optional<Ovnis> getById(Long id) {
        return repository.findById(id);
    }
}