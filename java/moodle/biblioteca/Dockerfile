# Imagen base con Java 17
FROM eclipse-temurin:17-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el JAR empaquetado
COPY target/biblioteca-0.0.1-SNAPSHOT /app/biblioteca-0.0.1-SNAPSHOT

# Exponer el puerto (ejemplo: 8080)
EXPOSE 8080

# Comando de arranque
ENTRYPOINT ["java", "-jar", "biblioteca-0.0.1-SNAPSHOT"]

