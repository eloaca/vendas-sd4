# DSVendas
##### Esse SPA (Single Page Application) foi desenvolvido na Semana Spring React 4.0 do [devSuperior](https://www.youtube.com/c/DevSuperior).

###### O DSVendas exibe um Dashboard com Vendedores e Vendas, exibindo em tabelas e gráficos. 

### Funcionalidades

- Gráficos em Barra e Pizza
- Pagina Home e Dashboard
- Tabela Paginada

### Tecnologias Usadas

##### Backend:

- Java 11
- Maven
- Spring Boot
- Spring Security
- Spring Data
- Lombok
- MySQL
- H2
- Implementado no Heroku: https://vendas-eloaca.herokuapp.com/

##### Frontend:

- ReactJS
- TypeScript
- Yarn
- NPM
- Html
- CSS
- Bootstrap
- Implementado no Netlify: https://eloaca-sds4.netlify.app/

### Instalação

Para subir o backend localmente com banco de dados em memória: 

```sh
- Dentro do diretório 'backend'
- mvn clean install && mvn spring-boot:run
```

Para subir o frontend localmente: 
```sh
- Dentro do diretório 'frontend'
- yarn start
```
### EndPoints

##### Sale

- Buscar todas as vendas por página
```sh
localhost:8080/sales/findAll?page=0&size=20&sort=date,desc
```

- Buscar vendas de sucesso por vendedor
```sh
localhost:8080/sales/sucessBySeller
```

- Buscar vendas por vendedor
```sh
localhost:8080/sales/amountBySeller
```

##### Sellers
- Buscar todos os vendedores
```sh
localhost:8080/sellers/findAll
```

##### PS
- Este projeto foi apenas para fins de aprendizado.
