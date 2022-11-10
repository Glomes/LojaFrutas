package br.edu.uerr.loja.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.uerr.loja.modelo.ClientePessoaFisica;
import br.edu.uerr.loja.repositorio.ClientePessoaFisicaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class ClientePessoaFisicaControle {
    

@Autowired
ClientePessoaFisicaRepositorio clientePessoaFisicaRepositorio;


@GetMapping("/clientePessoaFisica")
public String abreClientePessoaFisica (Model modelo){

    modelo.addAttribute("listaClientes", clientePessoaFisicaRepositorio.findAll());
    
    return"cliente";

}

@GetMapping("/cadastroClienteFisico")
	public String abreformClienteFisico(Model modelo) {
		ClientePessoaFisica clientePessoaFisica = new ClientePessoaFisica();
		modelo.addAttribute("clientePessoaFisica", clientePessoaFisica);
		return "formClienteFisico";
		}

@PostMapping("/salvarClienteFisico")
public String salvar(@ModelAttribute("clientePessoaFisica")ClientePessoaFisica clientePessoaFisica, Model modelo) {
    
    clientePessoaFisicaRepositorio.save(clientePessoaFisica);
    
    modelo.addAttribute("listaClientesPessoaFisica", clientePessoaFisicaRepositorio.findAll());
    return "redirect:empresa";
}







}

        
    










