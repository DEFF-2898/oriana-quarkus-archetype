# Proyecto generado por el arquetipo

# Oriana Quarkus Service Template (Java 21, Quarkus 3.27.2 - LTS stream)

Este proyecto está pensado como **plantilla** para tus microservicios del ERP Oriana en Quarkus (modo imperativo), con PostgreSQL y buenas prácticas base.

## Qué incluye
- Quarkus REST (resteasy-reactive-jackson)
- PostgreSQL (JDBC) + Hibernate ORM Panache (opcional para reducir boilerplate)
- Flyway con tus scripts SQL en `src/main/resources/db/migration`
- Health + OpenAPI/Swagger UI
- Métricas Prometheus

## Ejecutar en local (PostgreSQL)
1) Levanta Postgres:
```bash
docker compose -f docker/docker-compose.yml up -d
```

2) Ejecuta Quarkus:
```bash
mvn quarkus:dev
```

3) URLs útiles:
- Swagger UI: http://localhost:8080/q/swagger-ui
- OpenAPI JSON: http://localhost:8080/q/openapi
- Health: http://localhost:8080/q/health
- Metrics: http://localhost:8080/q/metrics

## Convenciones recomendadas (para tu ERP)
- `resource` (REST controllers) delgados
- `service` (reglas de negocio / transacciones)
- `repository` (acceso a datos)
- DTOs separados de entidades (no exponer entidades directamente)

## OpenAPI de referencia
Se copiaron tus contratos a: `src/main/resources/openapi/contracts/`
(son **referencia**; este template no genera código automáticamente a partir de esos YAML).

