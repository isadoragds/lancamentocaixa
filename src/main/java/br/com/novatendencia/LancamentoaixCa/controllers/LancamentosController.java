package br.com.novatendencia.LancamentoaixCa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.novatendencia.LancamentoaixCa.models.Lancamento;
import br.com.novatendencia.LancamentoaixCa.repositorio.LancamentosRepo;
import br.com.novatendencia.LancamentoaixCa.repositorio.ReferenciaRepo;

@Controller
public class LancamentosController {

	@Autowired
	public LancamentosRepo repo;

	@PostMapping("/lancamentos")
	public String Criar(@ModelAttribute Lancamento lancamento, Model model) {
		repo.save(lancamento);
		return "redirect:/";
	
	}
	
	@DeleteMapping("/lancamentos/{id}")
	public String Deletar(@PathVariable Integer id) {
		repo.deleteById(id);
		return "redirect:/";
	}
}