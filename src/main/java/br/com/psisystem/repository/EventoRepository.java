package br.com.psisystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.psisystem.model.Evento;


public interface EventoRepository extends JpaRepository<Evento, Long>{

}
