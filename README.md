# API REST - Loja

## Descrição

Este projeto consiste em uma API REST desenvolvida em Java com Spring Boot para gerenciar os dados de uma pequena loja.

A API permite cadastrar, consultar e excluir produtos, clientes e pedidos.

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- Banco de dados H2
- Maven
- Postman

## Funcionalidades

- Cadastro de produtos, clientes e pedidos.
- Consulta dos registros cadastrados.
- Exclusão de registros.

## Endpoints

### Produtos

| Método HTTP | Endpoint | Descrição |
|---|---|---|
| GET | `/produtos` | Lista os produtos |
| POST | `/produtos` | Cadastra um produto |
| DELETE | `/produtos/{id}` | Exclui um produto |

### Clientes

| Método HTTP | Endpoint | Descrição |
|---|---|---|
| GET | `/clientes` | Lista os clientes |
| POST | `/clientes` | Cadastra um cliente |
| DELETE | `/clientes/{id}` | Exclui um cliente |

### Pedidos

| Método HTTP | Endpoint | Descrição |
|---|---|---|
| GET | `/pedidos` | Lista os pedidos |
| POST | `/pedidos` | Cadastra um pedido |
| DELETE | `/pedidos/{id}` | Exclui um pedido |

## Exemplo de cadastro de produto

Requisição POST para `/produtos`:

```json id="9k7w2p"
{
  "nome": "Arroz",
  "preco": 5.50,
  "quantidade": 10
}
```

## Como executar o projeto

1. Instale o Java 21.
2. Abra o projeto no IntelliJ IDEA.
3. Aguarde o Maven baixar as dependências.
4. Execute a classe principal da aplicação Spring Boot.
5. Utilize o Postman para testar os endpoints.

## Testes

Os endpoints foram testados utilizando o Postman para verificar as operações implementadas na API.

## Objetivo acadêmico

O projeto foi desenvolvido como atividade acadêmica para praticar a criação de APIs REST com Java e Spring Boot, a organização do código em camadas, o mapeamento de entidades com JPA e a integração com banco de dados relacional.
