<h2>hogwarts-sorting-hat</h2>
Exercício para implementação de programação reativa utilizando a biblioteca RxJava, aplicação SpringBoot com banco de dados e as seguintes funcionalidades:
  
<h3>Adicionando um aluno em Hogwarts:</h3>
<li>id</li>
<li>nome</li>
<li>id_house</li>

<h3>Fluxo de inserção [Post]:</h3>
O usuário deverá preencher somente o nome do aluno.
O sistema ao receber a requisição, consulta o endpoint: (GET) https://api-harrypotter.herokuapp.com/sortinghat

<h3>Fluxo de consulta e listagem [Get]:</h3>
Ao consultar um aluno ou listagem dos alunos com id da casa do aluno deve-se ser consultado o endpoint: (GET) https://api-harrypotter.herokuapp.com/house/:id, onde o :id refere-se ao identificador informado pelo chapéu seletor

Obs: Para ver todas as casas de Hogwarts https://api-harrypotter.herokuapp.com/houses

<h3>Tecnologias:</h3>
 
 <ul>
  <li>Java 11</li>
  <li>Maven</li>
  <li>Spring Boot</li>
  <li>RxJava</li>
  <li>OpenFeign</li>
  <li>JPA</li>
  <li>H2</li>
  <li>Lombok</li>
  </ul>
