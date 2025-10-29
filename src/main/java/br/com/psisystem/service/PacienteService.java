package br.com.psisystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.psisystem.model.Evento;
import br.com.psisystem.model.Paciente;
import br.com.psisystem.repository.PacienteRepository;

@Service
public class PacienteService {

	
	@Autowired
	private PacienteRepository pr;
	
	
	public List<Paciente> listarTodos(){
		return pr.findAll();
	}
	
	public Paciente criar(Paciente paciente) {
		return pr.save(paciente);
		
	}
	
	public Optional<Paciente> listarPorId(Long id) {
		return pr.findById(id);
	}
	
	public void deletarPorId(Long id) {
		pr.deleteById(id);
	}
	

    public Paciente atualizarPaciente(Long id, Paciente dadosAtualizados) {
        Optional<Paciente> optionalPaciente = pr.findById(id);

        if (optionalPaciente.isPresent()) {
            Paciente pacienteExistente = optionalPaciente.get();

            // Atualiza os campos
            pacienteExistente.setDs_nome((dadosAtualizados.getDs_nome() == null ? pacienteExistente.getDs_nome() : dadosAtualizados.getDs_nome()));
            pacienteExistente.setDt_nascimento((dadosAtualizados.getDt_nascimento() == null ? pacienteExistente.getDt_nascimento() : dadosAtualizados.getDt_nascimento()));
            pacienteExistente.setNr_telefone((dadosAtualizados.getNr_telefone() == null ? pacienteExistente.getNr_telefone() : dadosAtualizados.getNr_telefone()));
            pacienteExistente.setDs_email((dadosAtualizados.getDs_email() == null ? pacienteExistente.getDs_email() : dadosAtualizados.getDs_email()));

            return pr.save(pacienteExistente);
        } else {
            throw new RuntimeException("Paciente com ID " + id + " não encontrado.");
        }
    }
	
}
