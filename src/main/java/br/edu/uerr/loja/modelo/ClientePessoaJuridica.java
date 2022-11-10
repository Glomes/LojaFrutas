package br.edu.uerr.loja.modelo;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

    @Entity
    @Table(name="cliente_pessoa_juridica")
    public class ClientePessoaJuridica implements Serializable {
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        private String cnpj;
        public String getcnpj() {
            return cnpj;
        }
        public void setcnpj(String cnpj) {
            this.cnpj = cnpj;
        }
        
        private String inscricao_estadual;
        public String getInscricao_estadual() {
            return inscricao_estadual;
        }
        public void setInscricao_estadual(String inscricao_estadual) {
            this.inscricao_estadual = inscricao_estadual;
        }
        
        private String proprietario;
        public String getProprietario() {
            return proprietario;
        }
        public void setProprietario(String proprietario) {
            this.proprietario = proprietario;
        }
        
        private String representante;
        
        public String getRepresentante() {
            return representante;
        }
        public void setRepresentante(String representante) {
            this.representante = representante;
        }
       
        private String ramo_atividade;
        public String getRamo_atividade() {
            return ramo_atividade;
        }
        public void setRamo_atividade(String ramo_atividade) {
            this.ramo_atividade = ramo_atividade;
        } 
        //@Column(name"cliente_id")
        //@MapsId
        @OneToOne
        @JoinColumn(name = "cliente_id")
        private Cliente cliente;




}
