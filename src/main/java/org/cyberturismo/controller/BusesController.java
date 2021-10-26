package org.cyberturismo.controller;

import org.cyberturismo.model.Buses;
import org.cyberturismo.repository.IBusesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BusesController {
	
	@GetMapping("/cargar")
	public String cargarPag(Model model) {
		model.addAttribute("buses",new Buses());
		return "consulta-chavez";
	}
	
	@Autowired
	private IBusesRepository repo;
	
	@PostMapping("/grabar")
	public String grabarPag(@ModelAttribute Buses bus) {
		System.out.println(bus);
		repo.save(bus);
		return "consulta-chavez";
	}
	
	@GetMapping("/listar")
	public String listadoBus(Model model) {
		model.addAttribute("lstBus", repo.findAll());
		return "consulta-chavez";
	}
	
	@PostMapping("/editar")
	public String buscarBus(@ModelAttribute Buses b, Model model ) {
		System.out.println(b);
		model.addAttribute("buses", repo.findById(b.getCodigo()));
		return "actualiza-chavez";
	}

}
