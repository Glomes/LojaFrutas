package br.edu.uerr.loja.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.uerr.loja.modelo.Fornecedor;
import br.edu.uerr.loja.modelo.Produto;
import br.edu.uerr.loja.repositorio.EmpresaRepositorio;
import br.edu.uerr.loja.repositorio.FornecedorRepositorio;
import br.edu.uerr.loja.repositorio.ProdutoRepositorio;

@Controller
public class ProdutoControler {

	@Autowired
	ProdutoRepositorio produtoRepositorio;
	
	@Autowired
	EmpresaRepositorio empresaRepositorio;
	
	@Autowired
	FornecedorRepositorio fornecedorRepositorio;
	
	//Listar
	@GetMapping("/fornecedor")
	public String abrefornecedor(Model modelo) {
		modelo.addAttribute("listaFornecedor", fornecedorRepositorio.findAll());
		return "abrefornecedor";
	}
	
	//From
	@GetMapping("/cadastroProduto")
	public String novoProduto(Model model) {
		Produto produto = new Produto();
		
		model.addAttribute("listaEmpresas", empresaRepositorio.findAll());		
		model.addAttribute("listaFornecedores", fornecedorRepositorio.findAll());
		
		
		model.addAttribute("produto",produto);
		return "formProduto";
	}
	
	//Salvar/Alterar
	
	@PostMapping("/salvarFornecedor")
	public String salvar(@ModelAttribute("fornecedor")Fornecedor fornecedor, Model modelo) {
		
		fornecedorRepositorio.save(fornecedor);
		
		modelo.addAttribute("listaFornecedor", fornecedorRepositorio.findAll());
		modelo.addAttribute("listaEmpresas", empresaRepositorio.findAll());
		return "redirect:empresa";
	}
	//Deletar
	
	
	
	






	
}

