package br.com.novatendencia.LancamentoaixCa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.novatendencia.LancamentoaixCa.repositorio.ReferenciaRepo;
import br.com.novatendencia.LancamentoaixCa.models.Referencia;

@Controller
public class HomeController {	
	
	@Autowired
	private ReferenciaRepo repo;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Referencia> referencias = (List<Referencia>)repo.findAll();
		model.addAttribute("referencias", referencias);
		return "home/index";
	}
}
