package br.com.psisystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.psisystem.model.Evento;
import br.com.psisystem.model.Paciente;
import br.com.psisystem.repository.EventoRepository;

@Service
public class EventoService {

	
	@Autowired
	private EventoRepository er;
	
	
	
	public List<Evento> listarTodos(){
		return er.findAll();
	}
	
	public Evento criar(Evento evento) {
		return er.save(evento);
		
	}
	
	public Optional<Evento> listarPorId(Long id) {
		return er.findById(id);
	}
	
	public void deletarPorId(Long id) {
		er.deleteById(id);
	}
	

    public Evento atualizarEvento(Long id, Evento dadosAtualizados) {
        Optional<Evento> optionalEvento = er.findById(id);

        if (optionalEvento.isPresent()) {
        	Evento eventoExistente = optionalEvento.get();

            // Atualiza os campos
        	eventoExistente.setDescricao((dadosAtualizados.getDescricao() == null ? eventoExistente.getDescricao() : dadosAtualizados.getDescricao())); 
        	eventoExistente.setDtInicio((dadosAtualizados.getDtInicio() == null ? eventoExistente.getDtInicio() : dadosAtualizados.getDtInicio()));
        	eventoExistente.setDtFim((dadosAtualizados.getDtFim() == null ? eventoExistente.getNmEvento() : dadosAtualizados.getNmEvento()));
        	eventoExistente.setNmEvento((dadosAtualizados.getNmEvento() == null ? eventoExistente.getNmEvento() : dadosAtualizados.getNmEvento()));

            return er.save(eventoExistente);
        } else {
            throw new RuntimeException("Evento com ID " + id + " não encontrado.");
        }
    }
	
}
