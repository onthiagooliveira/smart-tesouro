# Analytics de Renda Fixa do Zero

Sistema inteligente para acompanhamento de títulos públicos, focado em alta performance e escalabilidade.

## Tecnologias
- Java 21+
- Spring Boot 4.1.0
- PostgreSQL
- Flyway (Migração de banco)
- JUnit 5 / Testcontainers

## Como rodar
1. Configure o Docker Desktop.
2. Certifique-se de que o arquivo `.env` esteja configurado na raiz com as credenciais:
   `DB_USER`, `DB_PASSWORD`, `DB_NAME`.
3. Rode o projeto com: `./mvnw spring-boot:run`

## Estrutura de Migração
As migrações são gerenciadas pelo Flyway em `src/main/resources/db/migration/`.
