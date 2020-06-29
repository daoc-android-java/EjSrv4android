package daoc.srv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@Autowired
	UsuarioRepository repository;
	
	@GetMapping("/todos")
	public List<Usuario> getUsuarios() {
		List<Usuario> lista = new ArrayList<>();
		repository.findAll().forEach(lista::add);
		return lista;
	}
	
	@GetMapping("/algo")
	public String getAlgo(@RequestParam("num") double num) {
		return "Recibí el num: " + num;
	}
	
	@PostMapping("/body")
	public String createUsuario(@RequestBody String body) {
		return body.toUpperCase();
	}
	
}
