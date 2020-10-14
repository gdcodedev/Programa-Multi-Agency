# Introdução do Crud Sinapsis
- Criando um Crud para execução do projeto
- Utilizando Spring Boot e Clean
- SGBD utilizado MySQL 8.0
- PostMan para interação do banco
- Intellij como IDE utilizada
- Gradle
- SwaggerConfig

# Base do projeto
- 5 Endpoints : id , codigo, nome, latitude, logitude.
- POST — add new data
- PUT — replace existing data
- PATCH — update some existing data fields
- DELETE — delete existing data

# Código fonte 

    @Id
    @Column(name = "ID_SUBESTACAO")
    private Integer id;
    private String codigo;
    private String nome;
    private Double latitude;
    private Double longitude;

![img1](https://user-images.githubusercontent.com/65917790/96030475-6cb6b900-0e32-11eb-83d4-e6060b2c2ca4.jpeg)
![img2](https://user-images.githubusercontent.com/65917790/96030481-6de7e600-0e32-11eb-8fb2-d37229ef8455.jpeg)
![img3](https://user-images.githubusercontent.com/65917790/96030488-6e807c80-0e32-11eb-9a5f-424a6ad35c8b.jpeg)
