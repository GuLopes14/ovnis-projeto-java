package br.com.fiap.ovnis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.ovnis.model.Ovnis;

public interface OvnisRepository extends JpaRepository<Ovnis, Long>{
    
}
