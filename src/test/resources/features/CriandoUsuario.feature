# language: pt

Funcionalidade: Cria Uma Conta

	Eu como cliente
	quero Criar uma conta 
	para ter acesso a loja virtual

@criar-usuario
Cenario: Criar Conta com um E-mail valido
	Dado que eu esteja no site automationpractice
	Quando clico no botao Entrar
	E em seguida preencho o campo Endereco de email com um E-mail Valido
	E Clico no botao Crie a sua conta aqui
	E Preencho os dados obrigatorios do formulario de cadastro
	E apos preencher, clicar no botao Registro
	Entao A conta deve ser criada/cadastrada com sucesso.
	
	@Criar-usuario-email-invalido
Cenario: Validando um E-mail invalido
	Dado que eu esteja no site automation
	Quando clico no botao Entrar da pagina Home
	E em seguida preencho o campo Endereco de email invalido
	E Clico no botao para avancar
	Entao o sistema apresenta a mensagem Invalid email address.
	
		@criar-usuario-com-Email-cadastrado
Cenario: Validando um E-mail ja cadastrado
	Dado que eu esteja no site 
	Quando clico no botao Entrar na pagina Home
	E preencho o campo Endereco de email ja cadastrado
	E Clico no botao para seguir com o cadastro
	Entao o sistema apresenta a mensagem An account using this email address has already been registered. Please enter a valid password or request a new one.
	