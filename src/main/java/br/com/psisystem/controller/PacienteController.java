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

import br.com.psisystem.model.Paciente;
import br.com.psisystem.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	private PacienteService ps;
	
	@GetMapping
	public List<Paciente> listar(){
		return ps.listarTodos();
	}
	
	
	@PostMapping("/criar")
	public Paciente criar(@RequestBody Paciente paciente) {
		return ps.criar(paciente);
	}
	
	@DeleteMapping("deletar/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id){
		ps.deletarPorId(id);
		return ResponseEntity.noContent().build();
	}
	
	
	@PutMapping("atualizar/{id}")
    public ResponseEntity<Paciente> atualizarPaciente(@PathVariable Long id, @RequestBody Paciente paciente) {
        try {
            Paciente atualizado = ps.atualizarPaciente(id, paciente);
            return ResponseEntity.ok(atualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
	
}
