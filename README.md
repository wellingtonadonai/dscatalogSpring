# DSCatalog Spring 🛒

API REST desenvolvida com **Spring Boot**, simulando um catálogo de produtos com funcionalidades de listagem, detalhamento e manipulação de dados via operações CRUD.

## 📌 Sobre o Projeto

Este projeto foi desenvolvido como prática de aprendizado em Java com Spring Boot. Ele representa a estrutura típica de um sistema de catálogo de produtos, com boas práticas de organização de código e uso de camadas como DTO, Services e Repositories.

## ⚙️ Tecnologias e Ferramentas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (ambiente de testes)
- PostgreSQL (produção)
- Maven
- JPA / Hibernate
- Bean Validation
- Spring DevTools
- Testes com JUnit

## 🧱 Estrutura do Projeto

Back-end/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com.wellington.dscatalogSpring/
│ │ │ ├── entities/
│ │ │ ├── repositories/
│ │ │ ├── services/
│ │ │ ├── DTO/
│ │ │ └── controllers/
│ │ └── resources/
│ │ └── application.properties


## 📋 Funcionalidades

- ✅ Listagem de produtos e categorias
- 🔍 Busca por ID
- ➕ Cadastro de novos produtos/categorias
- ✏️ Atualização de dados
- ❌ Exclusão
- 🔒 Validações com Bean Validation

## 🛠️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/wellingtonadonai/dscatalogSpring.git

   Acesse o diretório do projeto: cd dscatalogSpring/Back-end

   Execute o projeto com Maven: ./mvnw spring-boot:run

   Acesse a API:

Local: http://localhost:8080

🔎 Exemplos de Endpoints

GET /products

GET /products/{id}

POST /products

PUT /products/{id}

DELETE /products/{id}

📌 Banco de Dados
Por padrão, utiliza H2 com dados em memória para testes. Para usar o PostgreSQL, configure no application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/seubanco
spring.datasource.username=seuusuario
spring.datasource.password=suasenha

🧠 Aprendizados
Organização de projetos com Spring Boot

Boas práticas com DTOs e camadas de serviço

Integração com banco de dados relacional

Criação de APIs RESTful

Testes unitários com JUnit

📄 Licença
Este projeto está licenciado sob a licença MIT.


