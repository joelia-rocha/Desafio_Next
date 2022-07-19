<h3 align="center">
  Challenge: API REST Ifood
</h3>
<br>

<p align="center">
  <a href="#rocket-sobre-o-desafio">Sobre o desafio</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#template-da-aplicação">Template da aplicação</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#configuração-do-projeto">Configuração do Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#funcionalidades-da-api">Funcionalidades da API</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#rocket-expandindo-os-horizontes">Expandindo os horizontes</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 
</p>

## :rocket: Sobre o desafio

Nesse desafio, você irá desenvolver uma API REST, que atende a um Restaurante. Agora você irá praticar o que você aprendeu até agora no modulo de java do NExT sobre Java e Spring Boot, para criar uma pequena API para pedidos de comida.

Essa será uma API receberá requisições de um aplicativo movel, e retornará e filtrará os pratos de comida cadastrados na API e permitirá a criação de novos pedidos.

Agora navegue até a pasta criada e abra no Visual Studio Code, lembre-se de executar maven para atualizar todas as dependências.

## Configuração do Projeto

Java 11, Spring Boot, Maven para gerenciamento de dependências, JUnit para testes unitários e MySQL Database para banco de dados.

Antes de tudo, para que você tenha os dados para exibir em tela, você deverá criar alguns registros no seu banco de dados para te prover esses dados.

Ao se ter a base de dados, vocês deverão criar controllers e as suas rotas, onde retornaram seus devidos dados:

## Funcionalidades da API

Agora que você já está com o template instalado e pronto para continuar, você deve verificar os arquivos da pasta `src` e completar o código para atingir os objetivos do projeto.

- **`Listar os pratos de comida da sua API`**: Sua API deve ser capaz de retornar uma listagem, de uma parte de todos os pratos de comida que estão cadastrados na sua API.

- **`Cadastrar um prato de comida na sua API`**: Sua API deve ser capaz de cadastrar um novo produto na sua API.

- **`Listar as categorias da sua API`**: Sua API deve ser capaz de retornar uma listagem, de todas as categorias que estão cadastrados na sua API.

- **`Buscar pratos de comida ou categorias por id ou com filtros personalizados`**: Em sua API deverá ser capaz de fazer uma busca na API de acordo com o parametro enviado na sua requisição.

- **`Listar os pedidos da sua API`**: Sua API deve ser capaz de retornar uma listagem, com as informações dos produtos pedidos, de todos os pedidos que estão cadastrados na sua API.

**Dica**: Por se tratar de um desafio simples sem autenticação e de não possuir usuários, não será necessário cadastrar o campo `user_id`, considere que deve ser listados todos os pedidos da API como se fossem os seus pedidos.

- **`Listar os pratos favoritos da sua API`**: Sua API deve ser capaz de retornar uma listagem, com os campos e as informações dos produtos favoritados, de todos os favoritos que estão cadastrados na sua API.

**Dica**: Por se tratar de desafio simples sem autenticação e de não possuir usuários, não será necessário cadastrar o campo `user_id`, considere que deve ser listados todos os favoritos da API como se fossem os seus favoritos.

### Exemplo de rotas da API

  - **Rota `/produtos`**: Retorna todos os produtos cadastrados na API

  - **Rota `/produto/:id`**: Retorna um produto cadastrado na API baseado no `id`

  - **Rota `/categorias`**: Retorna todas as categorias cadastradas na API

  - **Rota `/pedidos`**: Retorna todas os pedidos que foram cadastrados na API

  - **Rota `/favoritos`**: Retorna todas as comidas favoritas que foram cadastrados na API

Para executar esse servidor você pode executar o seguinte comando:

```
  mvn spring-boot:run
```

## :rocket: Expandindo os horizontes

Essa é uma aplicação totalmente escalável, isso significa que além das específicações, após finalizado o desafio, é totalmente possível implementar mais funcionalidades a essa aplicação, e essa será uma ótima maneira para fixar os conhecimentos.
