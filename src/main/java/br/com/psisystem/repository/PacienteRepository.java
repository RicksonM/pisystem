package br.com.psisystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.psisystem.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
	

}
