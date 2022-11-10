package br.edu.uerr.loja.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.uerr.loja.modelo.ClientePessoaJuridica;
import br.edu.uerr.loja.repositorio.ClientePessoaJuridicaRepositorio;


@Controller
public class ClientePessoaJuridicaControle {
    @Autowired
    ClientePessoaJuridicaRepositorio clientePessoaJuridicaRepositorio;


    @GetMapping("/clientePessoaJuridica")
    public String abreClientePessoaJuridica (Model modelo){

        modelo.addAttribute("listaClientes", clientePessoaJuridicaRepositorio.findAll());
        
        return"cliente";

    }

    @GetMapping("/cadastroClienteJuridico")
        public String abreformClienteJuridico(Model modelo) {
            ClientePessoaJuridica clientePessoaJuridica = new ClientePessoaJuridica();
            modelo.addAttribute("clientePessoaJuridica", clientePessoaJuridica);
            return "formClienteFisico";
            }

    @PostMapping("/salvarClienteJuridico")
    public String salvar(@ModelAttribute("clientePessoaJuridica")ClientePessoaJuridica clientePessoaJuridica, Model modelo) {
        
        clientePessoaJuridicaRepositorio.save(clientePessoaJuridica);
        
        modelo.addAttribute("listaClientesPessoaJuridica", clientePessoaJuridicaRepositorio.findAll());
        return "redirect:empresa";
    }

}
