# Pablo Henrique

## Introdução

Me chamo Pablo Henrique, sou estudante de Banco de Dados na FATEC São José dos Campos (Prof. Jessen Vidal), atualmente no 4º semestre. Atuo como estagiário de analista de dados na engenharia de manutenção da Gerdau SJC, neste portfólio apresento minhas contribuições em nossos desenvolvimentos de APIs.

## Contatos

* [![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/pablohgs05)  
* [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/pablohgs05)

## Meus Principais Conhecimentos

- **Java & Spring Boot** (REST, Data JPA, Thymeleaf)  
- **Python** (scripting, análise de dados)  
- **SQL** (MySQL, PostgreSQL)  
- **Git & GitHub** (fluxo de branches, revisão de PRs)  
- **Web Scraping** (Jsoup)  
- **APIs REST** (modelagem de endpoints, DTOs)  
- **Modelagem de Dados** (ER, normalização)  
- **Metodologias Ágeis** (SCRUM)

## Meus Projetos

### Em 2024-2: API Porygon2

**Empresa parceira:** GSW (Global Solutions & Web)  
**Problema:** Pesquisadores precisavam automatizar a captura e organização de notícias e dados vindos de portais e APIs para análise estratégica, mas enfrentavam dificuldade em filtrar e categorizar grandes volumes de informação.  
**Solução entregue:** Desenvolvemos uma aplicação web em Java/Spring Boot com templates Thymeleaf para cadastro de portais e APIs, raspagem agendada, filtros por tags (e sinônimos), paginação dinâmica e consulta avançada de dados.

[GIT ↗](https://github.com/PorygonAPI/Porygon2)

#### Tecnologias Utilizadas

- Java 22  
- Spring Boot 3.3.3 (Web, Data JPA, Thymeleaf, DevTools)  
- MySQL  
- Lombok  
- Jsoup (web scraping)  
- Jackson (JSON/XML)  
- Maven  

#### Contribuições Pessoais

- **Validação e Tratamento de Erros**  
  Modelei o `ApiDadosDTO` com anotações de Bean Validation e configurei handlers globais para respostas padronizadas em caso de falhas de input.  
- **Busca por Tags e Sinônimos**  
  Criei consultas customizadas em `ApiDadosRepository` para filtrar registros por palavras-chave e sinônimos, usando relacionamentos muitos-para-muitos.  
- **Associação Automática de Tags**  
  Implementei rotina de análise de texto que atribui tags às notícias e respostas de API no momento da coleta inicial, reduzindo a necessidade de categorização manual.  
- **Paginação Dinâmica**  
  Desenvolvi lógica de paginação backend (Pageable/Slice) e controles Thymeleaf no frontend, permitindo ajustar o número de itens por página conforme o volume de dados.  
- **Refatoração & Merges**  
  Reestruturei controllers e services para melhorar legibilidade, removi código duplicado, aumentei a cobertura de testes e conduzi merges de branches, resolvendo conflitos de forma organizada.

#### Aprendizados Efetivos

- **Design de APIs REST** – Consolidei padrões de melhores práticas para versionamento, DTOs e tratamento de exceções.  
- **Spring Data JPA Avançado** – Aprofundei uso de consultas dinâmicas, paginação e relacionamento M:N.  
- **Web Scraping Robusto** – Entendi como adaptar seletores HTML a sites heterogêneos e agendar tarefas com Spring Scheduler.  
- **Colaboração em Equipe** – Usei Jira e GitHub Projects para gerenciar sprints, refinei backlog e participei ativamente de code reviews.  
- **Qualidade de Código** – Apliquei princípios SOLID e pattern DTO/Service, melhorando manutenibilidade e testabilidade do sistema.
