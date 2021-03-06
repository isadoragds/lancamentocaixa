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

import br.com.novatendencia.LancamentoaixCa.repositorio.ReferenciaRepo;
import br.com.novatendencia.LancamentoaixCa.models.Referencia;

@Controller
public class ReferenciasController {
	
	@Autowired
	public ReferenciaRepo repo;
	
	@GetMapping("/referencias")
	public String index(Model model) {
		List<Referencia> referencias = (List<Referencia>)repo.findAll();
		model.addAttribute("referencias", referencias);
		model.addAttribute("referencia", new Referencia());
		return "referencias/referencias";
	}

	@PostMapping("/referencias")
	public String Criar(@ModelAttribute Referencia referencia, Model model) {
		repo.save(referencia);
		return "redirect:/referencias";
	
	}
	
	@DeleteMapping("/referencias/{id}")
	public String Deletar(@PathVariable Integer id) {
		repo.deleteById(id);
		return "redirect:/referencias";
	}
}
