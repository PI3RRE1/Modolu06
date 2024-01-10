package com.airlaine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.airlaine.model.Usuario;
import com.airlaine.repository.UsuarioRepository;

@Controller
public class MenuController {

	@Autowired
	private UsuarioRepository usuarioRepository;
//	@Autowired
//	private ServicoRepository servicoRepository;
	
  @GetMapping("/promocoes")
  public String showProfissionaisPage() {
    return "promocoes";
  }
//	
	@GetMapping("/destino")
	public String showDestinoPage() {
		return "destino";
	}
//	
//	@GetMapping("/entrar")
//	public String showEntrarPage() {
//		return "entrar";
//	}
  
	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("index.html");
		
//		List<Servico> servicos = servicoRepository.findAll();
		List<Usuario> usuarios = usuarioRepository.findAll();
//		modelAndView.addObject("servicos", servicos);
		modelAndView.addObject("usuarios", usuarios);
 
		return modelAndView;
	}
//	@GetMapping
//	public ModelAndView listarUsuarios() {
//		ModelAndView modelAndView = new ModelAndView("index.html");
//		
//		List<Usuario> usuarios = usuarioRepository.findAll();
//		modelAndView.addObject("usuarios", usuarios);
//		
//		return modelAndView;
//	}
	
	

}
