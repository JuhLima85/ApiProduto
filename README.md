# API REST - PRODUTO 

Esta API REST de produto é empacotada em um contêiner Docker personalizado, oferecendo dois benefícios: a segurança dos dados e a facilidade na implantação e gerenciamento da aplicação em diferentes ambientes.

# Tecnologias utilizadas:

- Java 11
- Spring Boot
- Swagger
- Banco de dados: MySQL (será criado automaticamente 'apidb')
- Docker

### Você pode rodar o projeto usando a imagem da aplicação que está hospedada no Docker Hub ou baixando-o aqui no GitHub.
### Executar projeto usando a imagem da aplicação:
#### 1 – Inicie o contêiner MySQL:
`docker run --name mysqldb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_ROOT_DATABASE=testedb -p 3307:3306 -d mysql`
####  2 – Crie uma rede para unir a aplicação ao banco de dados:
`docker network create apirest-network`
####  3 - Conecte o contêiner mysqldb à rede:
`docker network connect apirest-network mysqldb`
#### 4 – Crie um novo contêiner para aplicação usando a imagem "devjuliana/apirest", conecte à rede, define as configurações de conexão com bd Mysql e especifique a porta 9090:
`docker run -p 9090:8080 --name app --net apirest-network -e MYSQL_HOST=mysqldb -e MYSQL_USER=root -e MYSQL_PASSWORD=root -e MYSQL_PORT=3306 devjuliana/apirest`
#### Pronto, a aplicação será iniciada!
#### URL da aplicação: http://localhost:9090/swagger-ui.html

<br/>

### Executar usando o projeto do GitHub: 
`docker-compose up`
#### URL da aplicação: http://localhost:8080/swagger-ui.html

<br/>

## Swagger para documentação e teste de endpoints:
![Swagger](https://github.com/JuhLima85/API-REST/assets/89745459/67aa939d-9b93-412c-99df-366ccd8cdcce)

<br/>

#### 
# Autora
Juliana Lima

[![Linkedin](https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/feed/?trk=guest_homepage-basic_nav-header-signin)
[![WhatsApp](https://img.shields.io/badge/WhatsApp-25D366?style=for-the-badge&logo=whatsapp&logoColor=white)](https://contate.me/Juliana-Lima)
