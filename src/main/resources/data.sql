insert into empresa (nome, cnpj, responsavel, telefone, email) values
('banana 1','01.001.001/0001-12','Francisco','(95)99123-
2323','banana@lojas.com'),
('banana 2','11.001.001/0001-13','João','(95)99123-2323','banana@lojas.com'),
('banana 3','21.001.001/0001-14','Maria','(95)99123-
2323','banana@lojas.com'),
('banana 4','31.001.001/0001-15','Raimunda','(95)99123-
2323','banana@lojas.com'),
('banana 5','41.001.001/0001-16','Tiago','(95)99123-
2323','banana@lojas.com'),
('banana 6','51.001.001/0001-17','Carlos','(95)99123-
2323','banana@lojas.com');
insert into fornecedor (nome, cnpj, responsavel, telefone, email) values
('Coca-cola','01.001.001/0001-12','Francisco','(95)99123-
2323','banana@lojas.com'),
('Skol','11.001.001/0001-13','João','(95)99123-2323','banana@lojas.com'),
('Gavião','21.001.001/0001-14','Maria','(95)99123-2323','banana@lojas.com'),
('DB','31.001.001/0001-15','Raimunda','(95)99123-2323','banana@lojas.com'),
('Atacadão','41.001.001/0001-16','Tiago','(95)99123-
2323','banana@lojas.com'),
('BigAmigão','51.001.001/0001-17','Carlos','(95)99123-
2323','banana@lojas.com');
insert into cliente (id, nome, telefone, email, cep, logradouro,
numero_endereco, bairro, cidade, uf,tipo_cliente) values
(1,'Francisco Carlos de Lima Pereira','(95) 99128-
8207','fpcarlos@uerr.edu.br','69305480','AV São Paulo','935','Bairro dos
Estados','Boa Vista','RR',1),
(2,'Maria Antônia','(95) 99128-8118','maria@uerr.edu.br','69305481','AV
Manhão','935','Bairro dos Estados','Boa Vista','RR',1),
(3,'José da Silva Sauro','(95) 99136-1527','jose@uerr.edu.br','69305482','AV
Curitiba','132','Bairro dos Estados','Boa Vista','RR',1),
(4,'Camilo Dias','(95) 99127-1217','camilo@uerr.edu.br','69305483','AV Rio de
Janeiro','195','Bairro dos Estados','Boa Vista','RR',1);
insert into cliente_pessoa_fisica (id, cpf, rg, data_de_nascimento,
cliente_id)values
(1,'123.123.123-45','132456 SSP RR','1975-12-04',1),
(2,'123.123.123-45','132456 SSP RR','1985-10-04',2),
(3,'123.123.123-45','132456 SSP RR','1990-07-04',3),
(4,'123.123.123-45','132456 SSP RR','1988-03-04',4);