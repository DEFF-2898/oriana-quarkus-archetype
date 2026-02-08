# Oriana Quarkus Archetype

## Instalar localmente
Desde esta carpeta:

```bash
mvn -q -DskipTests install
```

## Generar un proyecto nuevo
Ejemplo (modo no interactivo):

```bash
mvn -q archetype:generate   -DarchetypeGroupId=com.oriana.archetypes   -DarchetypeArtifactId=oriana-quarkus-archetype   -DarchetypeVersion=1.0.0-SNAPSHOT   -DgroupId=com.miempresa.oriana   -DartifactId=inventory-service   -Dversion=0.1.0-SNAPSHOT   -Dpackage=com.miempresa.oriana.inventory   -DinteractiveMode=false
```

Luego:

```bash
cd inventory-service
docker compose -f docker/docker-compose.yml up -d
mvn quarkus:dev
```
