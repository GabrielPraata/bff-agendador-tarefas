# BFF Agendador de Tarefas

![Java](https://img.shields.io/badge/Java-21-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-brightgreen.svg)
![Feign](https://img.shields.io/badge/Feign-OpenFeign-blue.svg)
![OpenAPI](https://img.shields.io/badge/OpenAPI-3.0-orange.svg)

Projeto desenvolvido como Backend For Frontend (BFF) para o sistema de agendamento de tarefas. Esse serviço integra diferentes microsserviços relacionados a usuários e tarefas, centralizando e orquestrando chamadas para expor uma interface amigável ao frontend.

## ✨ Funcionalidades

* Agendamento de tarefas com data e hora
* Consulta e gerenciamento de tarefas do usuário
* Integração com APIs externas via Feign Client
* Notificações programadas
* Documentação da API com OpenAPI (Swagger)

## 🧹 Tecnologias Utilizadas

* **Java 21**
* **Spring Boot 3.4.5**
* **Spring Cloud OpenFeign**
* **Lombok**
* **Springdoc OpenAPI**
* **Feign HTTP Client (HC5)**

## 🔌 Dependências Principais

* `spring-boot-starter-web`
* `spring-cloud-starter-openfeign`
* `springdoc-openapi-starter-webmvc-ui`
* `feign-hc5`
* `lombok`

## 📁 Estrutura de Pastas (resumida)

```bash
src/
├── main/
│   ├── java/com/prata/bffagendador/
│   │   ├── client/             # Feign clients
│   │   ├── config/             # Configurações gerais
│   │   ├── controller/         # Controllers da API
│   │   ├── dto/                # Data Transfer Objects
│   │   ├── service/            # Lógica de negócio
│   │   └── BffAgendadorApplication.java
│   └── resources/
│       ├── application.yml     # Configurações da aplicação
│       └── ...
└── test/                       # Testes automatizados

```
## Microsserviços Relacionados

Este projeto depende de outros microsserviços que complementam a funcionalidade do **BFF Agendador**:

- **[Sistema de Usuários](https://github.com/GabrielPraata/usuario)**: Gerencia as operações de CRUD dos usuários.
- **[Serviço de Notificação](https://github.com/GabrielPraata/notificacao)**: Envia e-mails de notificação para os usuários sobre suas tarefas.
- **[Agendador de Tarefas](https://github.com/GabrielPraata/agendador-tarefas)**: Responsável pela gestão de tarefas, incluindo CRUD e notificações.

## Endpoints da API

### 1. Usuário

- **POST /usuario**: Cria um novo usuário.
- **POST /usuario/login**: Realiza login e retorna um token JWT.
- **GET /usuario?email=example@example.com**: Busca um usuário pelo e-mail.
- **PUT /usuario**: Atualiza dados do usuário.
- **DELETE /usuario/{email}**: Deleta um usuário pelo e-mail.

### 2. Tarefas

- **POST /tarefas**: Cria uma nova tarefa.
- **GET /tarefas**: Lista todas as tarefas do usuário autenticado.
- **GET /tarefas/eventos**: Retorna tarefas dentro de um intervalo de tempo.
- **PUT /tarefas**: Atualiza uma tarefa.
- **DELETE /tarefas?id=taskId**: Deleta uma tarefa.
- **PATCH /tarefas?status=INICIADA&id=taskId**: Atualiza o status da tarefa.

### 3. Notificação

- **POST /email**: Envia uma notificação por e-mail.

## 🚀 Como executar

1. **Clone o repositório**

   ```bash
   git clone https://github.com/GabrielPraata/bff-agendador-tarefas.git
   cd bff-agendador-tarefas
   ```

2. **Configure o arquivo `application.yml`**

   * Adicione as URLs dos serviços de usuários e tarefas
   * Exemplo:

     ```yaml
     usuarios:
       url: http://localhost:8081
     tarefas:
       url: http://localhost:8082
     ```

3. **Execute a aplicação**

   ```bash
   ./mvnw spring-boot:run
   ```

4. **Acesse a documentação Swagger/OpenAPI**

   ```
   http://localhost:8080/swagger-ui.html
   ```

## 💪 Testes

Para executar os testes:

```bash
./mvnw test
```

## 📌 Requisitos

* Java 21
* Maven 3.8+
* Microsserviços de Usuários e Tarefas em execução

## 🙋‍♂️ Autor

[Gabriel Prata](https://github.com/GabrielPraata)
