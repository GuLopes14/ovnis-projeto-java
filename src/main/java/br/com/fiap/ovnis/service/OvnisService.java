package br.com.fiap.ovnis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.ovnis.model.Ovnis;
import br.com.fiap.ovnis.repository.OvnisRepository;
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
}
