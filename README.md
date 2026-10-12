# API REST - Loja

## Descrição

Este projeto consiste em uma API REST desenvolvida em Java com Spring Boot para gerenciar os produtos de uma pequena loja.

A API permite cadastrar, consultar, atualizar e excluir produtos.

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- Banco de dados H2
- Maven
- Postman

## Funcionalidades

- Cadastrar produtos.
- Listar todos os produtos.
- Atualizar os dados de um produto.
- Excluir produtos.

## Endpoints

| Método HTTP | Endpoint | Descrição |
|---|---|---|
| GET | `/produtos` | Lista todos os produtos |
| POST | `/produtos` | Cadastra um produto |
| PUT | `/produtos/{id}` | Atualiza um produto |
| DELETE | `/produtos/{id}` | Exclui um produto |

## Exemplo de cadastro

Para cadastrar um produto, envie uma requisição POST para `/produtos` com o seguinte JSON:

```json
{
  "nome": "Arroz",
  "preco": 5.50,
  "quantidade": 10
}
```

## Como executar o projeto

1. Instale o Java 21.
2. Abra o projeto em uma IDE, como IntelliJ IDEA.
3. Aguarde o Maven baixar as dependências.
4. Execute a classe principal da aplicação Spring Boot.
5. Utilize o Postman para testar os endpoints.

## Testes

Os endpoints foram testados utilizando o Postman, verificando as operações de cadastro, consulta, atualização e exclusão de produtos.

## Objetivo acadêmico

O projeto foi desenvolvido como atividade acadêmica com o objetivo de praticar o desenvolvimento de APIs REST, a organização em camadas e a integração com banco de dados utilizando Java e Spring Boot.
