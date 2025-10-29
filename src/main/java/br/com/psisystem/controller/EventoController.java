package br.com.psisystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.psisystem.model.Evento;
import br.com.psisystem.model.Paciente;
import br.com.psisystem.service.EventoService;

@RestController
@RequestMapping("/eventos")
public class EventoController {

	@Autowired
	private final EventoService es;
	
	public EventoController(EventoService service) {
	        this.es = service;
	}
	
	@GetMapping
	public List<Evento> listar(){
		return es.listarTodos();
	}
	
	
	@PostMapping("/criar")
	public Evento criar(@RequestBody Evento evento) {
		return es.criar(evento);
	}
	
	@DeleteMapping("deletar/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id){
		es.deletarPorId(id);
		return ResponseEntity.noContent().build();
	}
	
	
	@PutMapping("atualizar/{id}")
    public ResponseEntity<Evento> atualizarEvento(@PathVariable Long id, @RequestBody Evento evento) {
        try {
            Evento atualizado = es.atualizarEvento(id, evento);
            return ResponseEntity.ok(atualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
	

	
}
