# API de Gerenciamento de Alunos

Este é um projeto simples para gerenciar alunos usando Spring Boot.

## Descrição

A API permite:
- Cadastrar alunos
- Listar alunos
- Atualizar dados de alunos
- Deletar alunos

## Instalação

### Pré-requisitos

- Java 17
- Maven
- MySQL


### Endpoints

- **Cadastrar Aluno**
    ```http
    POST /open-api/Cadastrar
    Content-Type: application/json
    {
        "nome": "Roberto",
        "sobrenome": "Vitor",
        "cpf": "12345678900",
        "nota": 8.5
    }
    ```
- **Listar Alunos**
    ```http
    GET /open-api/listarAluno
    ```
- **Atualizar Aluno**
    ```http
    PUT /open-api/AtualizaAluno/{matricula}
    Content-Type: application/json
    {
        "nome": "Roberto",
        "sobrenome": "Vitor",
        "cpf": "12345678900",
        "nota": 9.0
    }
    ```
- **Deletar Aluno**
    ```http
    DELETE /open-api/DeleterAluno/{matricula}
    ```
## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE.md](LICENSE.md) para mais detalhes.

## Contato

Para mais informações, entre em contato: robertovitor6666@gmail.com
