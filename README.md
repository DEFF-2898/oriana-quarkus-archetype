# Oriana Quarkus Template & Maven Archetype

Este repositorio provee una **base profesional y estandarizada** para el desarrollo de microservicios backend con **Quarkus**, alineada a buenas prácticas de arquitectura, mantenibilidad y escalabilidad.

Incluye **dos artefactos complementarios**:

- **Service Template (Golden Project)**: proyecto Quarkus listo para usar como referencia.
- **Maven Archetype**: permite generar nuevos servicios de forma consistente y rápida.

---

## 🎯 Objetivo

- Acelerar la creación de nuevos microservicios Quarkus.
- Garantizar **consistencia técnica** entre proyectos.
- Servir como **golden template** para decisiones de arquitectura, configuración y estructura.
- Reducir errores de setup inicial y divergencias entre equipos.

---

## 🧱 Artefactos

### 1️⃣ oriana-quarkus-service-template

Proyecto Quarkus completamente funcional que sirve como **plantilla base**.

Incluye:

- Estructura estándar de paquetes
- Configuración base de Quarkus
- Migraciones Flyway
- OpenAPI 3.1
- Ejemplo de capas (resource, service, repository)
- Configuración lista para desarrollo local

📂 Ruta:
```
oriana-quarkus-service-template/
```

---

### 2️⃣ oriana-quarkus-archetype

Arquetipo Maven que permite generar proyectos **idénticos a la plantilla**, parametrizando:

- groupId
- artifactId
- package base
- versión

📂 Ruta:
```
oriana-quarkus-archetype/
└── src/main/resources/archetype-resources/
```

---

## 🧪 Stack Tecnológico

- **Java:** 21 (LTS)
- **Quarkus:** 3.27.2 (stream)
- **Build:** Maven
- **API Contract:** OpenAPI 3.1
- **DB Migration:** Flyway

---

## ⚙️ Comandos

### 🔹 Compilar e instalar el arquetipo localmente

```bash
mvn clean install -DskipTests
```

Esto registra el arquetipo en tu repositorio local.

---

### 🔹 Generar un nuevo proyecto desde el arquetipo

```bash
mvn archetype:generate   -DarchetypeCatalog=local   -DarchetypeGroupId=com.oriana.archetypes   -DarchetypeArtifactId=oriana-quarkus-archetype   -DarchetypeVersion=1.0.0-SNAPSHOT   -DgroupId=erp.hotel.oriana   -DartifactId=oriana-quarkus-service   -Dversion=0.1.0-SNAPSHOT   -Dpackage=erp.hotel.oriana.service   -DinteractiveMode=false
```

---

### 🔹 Ejecutar el servicio

```bash
mvn quarkus:dev
```

---

## 📐 Buenas Prácticas Aplicadas

- Convención clara de paquetes
- Separación por capas
- Configuración externa vía `application.yaml`
- Preparado para observabilidad y seguridad
- Base sólida para CI/CD

---

## 🚀 Uso recomendado

- Proyectos nuevos de microservicios
- MVPs con necesidad de escalar
- Equipos que busquen estandarizar backend
- ERP Oriana y servicios relacionados

---

## 📌 Roadmap sugerido

- Soporte para perfiles (dev / test / prod)
- Integración con observabilidad (metrics, tracing)
- Seguridad (JWT / OAuth2)
- GitHub Actions / CI template
- Async (Kafka / AsyncAPI)

---

**Oriana ERP — Backend Engineering**
