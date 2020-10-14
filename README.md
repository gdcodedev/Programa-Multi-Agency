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
======================================
