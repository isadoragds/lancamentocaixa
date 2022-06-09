package br.com.novatendencia.LancamentoaixCa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.novatendencia.LancamentoaixCa.repositorio.LancamentosRepo;
import br.com.novatendencia.LancamentoaixCa.repositorio.ReferenciaRepo;
import br.com.novatendencia.LancamentoaixCa.models.Lancamento;
import br.com.novatendencia.LancamentoaixCa.models.Referencia;

@Controller
public class HomeController {	
	

	@Autowired
	public LancamentosRepo repo;
	
	@Autowired
	public ReferenciaRepo referenciasRepo;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Lancamento> lancamentos = (List<Lancamento>)repo.findAll();
		model.addAttribute("lancamentos", lancamentos);
		model.addAttribute("lancamento", new Lancamento());
		model.addAttribute("referencias", referenciasRepo.findAll());
		return "home/index";
	}
}
