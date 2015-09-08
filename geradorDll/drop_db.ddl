ALTER TABLE tb_estoque DROP CONSTRAINT tbestoqueidproduto
ALTER TABLE tb_cardapio DROP CONSTRAINT tbcrdpdcrdptmpprpr
ALTER TABLE tb_cardapio_tempo_preparo DROP CONSTRAINT tbcrdptmpprprdcrdp
ALTER TABLE tb_ingrediente_cardapio DROP CONSTRAINT tbngrdntcrdpiodstq
ALTER TABLE tb_ingrediente_cardapio DROP CONSTRAINT tbngrdntcrdpodcrdp
ALTER TABLE tb_funcionario DROP CONSTRAINT tbfncionariodsario
ALTER TABLE tb_funcionario DROP CONSTRAINT tbfncionariodpssoa
ALTER TABLE tb_pessoa DROP CONSTRAINT tbpessoaidendereco
ALTER TABLE tb_usuario_role DROP CONSTRAINT tbsarioroledsuario
DROP TABLE tb_produto
DROP TABLE tb_estoque
DROP TABLE tb_cardapio
DROP TABLE tb_cardapio_tempo_preparo
DROP TABLE tb_ingrediente_cardapio
DROP TABLE tb_funcionario
DROP TABLE tb_pessoa
DROP TABLE tb_endereco
DROP TABLE tb_usuario
DROP TABLE tb_usuario_role
