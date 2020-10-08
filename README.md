# Help Desk Api

## Inserir o usuário administrador

A inserção do usuário admin do sistema pode ser feita da seguinte forma.

Selecionamos o método post e definimos o endpoint.

![](./docs/post-admin.png)

Vamos enviar um body no formato json com email e senha.

``` json
{
    "email": "admin@helpdesk.com",
    "password": "123456"
}
```

A resposta deverá ser algo do tipo.

![](./docs/response-admin.png)

## Inserir um usuário e definindo qual o seu tipo de permissão

Para inserir um outro usuário vamos utilizar um endpoint diferente do usuário admin.

![](./docs/post-user.png)

Logo após vamos inserir uma key do tipo Authorization no header, copiar o token gerado para o administrador e inserir no value do Authorization para poder ter permissão de inserir o usuário.

![](./docs/token-user.png)

Vamos então passar o body do tipo json e fazer o envio da requisição.

![](./docs/body-user.png)

O retorno deverá ser algo do tipo.

![](./docs/response-user.png)

## Alterar um usuário

Para alterar os dados de um usuário vamos utilizar o método ```POST```.

![](./docs/put-user.png)

Vamos passar também o Authorization e o token como da mesma forma que no método anterior.

![](./docs/token-user.png)

E no bory vamos adicionar o id juntamente com as alteraçõs desejadas.

![](./docs/put-body-user.png)

A resposta deverá ser algo parecido com a imagem abaixo.

![](./docs/put-response-user.png)

## Buscar um usuário pelo id

Para fazer a busca vamos usar o método ```GET``` e passar o valor do id na url.

![](./docs/get-user.png)

Vamos passar o Authorization e o token no header para podermos ter permissão de fazer a busca.

![](./docs/get-header-user.png)

A resposta deverá ser algo do tipo.

![](./docs/response-get-header-user.png)

## Deletar um usuário

Para excluir um usuário vamos usar o método ```DELETE``` e passar o valor do id na url, assim como no método anterior.

![](./docs/delete-user.png)

Vamos passar o Authorization e o token no header para podermos ter permissão de deletar.

![](./docs/get-header-user.png)

A resposta deverá ser algo do tipo.

![](./docs/delete-response-user.png)

## Listar todos os usuários

Para listar vamos usar o método ```GET``` novamente e passar na url o valor "/0/10", onde serão exibidos 10 registros da primeira página.

![](./docs/list-all-users.png)

Vamos passar o Authorization e o token no header para podermos ter permissão de fazer a listagem.

![](./docs/get-header-user.png)

A resposta deverá ser algo do tipo.

![](./docs/response-list-all-user.png)