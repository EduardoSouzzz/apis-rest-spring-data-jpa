📦 APIs REST com Spring Boot + Spring Data JPA

Repositório focado em estudos e desenvolvimento de APIs REST utilizando Java + Spring Boot + Spring Data JPA.
Aqui você encontrará projetos com CRUDs, relacionamentos entre entidades, boas práticas e integração com banco de dados. 

🛠️ Tecnologias Utilizadas

* Java 17+
* Spring Boot
* Spring Data JPA
* Hibernate
* Maven
* H2 Database
* MySQL
* Postman
* STS / IntelliJ IDEA

---

📚 Conteúdos Praticados

Criação de APIs REST
CRUD completo
Arquitetura em camadas
Injeção de dependência
Spring Beans
Relacionamentos JPA:

* OneToOne
* OneToMany
* ManyToOne
* ManyToMany

Validações
Chaves Primárias Simples
Chaves Primárias Compostas
Uso de `@Entity`, `@Table`, `@Id`, `@GeneratedValue`
Uso de `@Service`, `@Repository`, `@RestController`
Tratamento de exceções
Integração com banco de dados

---

📂 Estrutura Base dos Projetos

```bash
src/main/java
│
├── controller
├── service
├── repository
├── entity
├── dto
├── config
└── exception
```

---

⚙️ Configuração do Banco

## H2 Database

```properties
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:testdb
```

Console:

```bash
http://localhost:8080/h2-console
```

---

## MySQL

```properties
spring.datasource.url=jdbc:mysql://localhost:8080/meubanco
spring.datasource.username=root
spring.datasource.password=minhaSenha

spring.jpa.hibernate.ddl-auto=update
```
---

📌 Objetivo do Repositório

Este repositório foi criado para:

* Evoluir conhecimentos em Java e Spring
* Praticar desenvolvimento backend
* Aprender modelagem de banco de dados
* Criar APIs REST profissionais
* Construir projetos para portfólio

---

📖 Conceitos Importantes

##  Controller
Responsável pelos endpoints da API e pelas requisições HTTP.

##  Service
Camada de regra de negócio da aplicação.

##  Repository
Responsável pelo acesso aos dados usando JPA.

##  Entity
Representação das tabelas do banco de dados.

---

🧠 Aprendizados
* Durante os projetos foram praticados conceitos como:

* Organização de código
* Padrão de arquitetura REST
* Persistência de dados
* Relacionamentos complexos
* Boas práticas com Spring
* Estruturação de APIs reais

---

🚧 Próximos Estudos
* Spring Security
* JWT
* Docker
* Testes Unitários
* Deploy
* Microsserviços

👨‍💻 Autor

* Desenvolvido por Eduardo de Ávila
* Estudando Java, Spring Boot e desenvolvimento backend.

