# Notas maven

maven es un administrador de paquetes y proyectos para java 
se pueden generar proyectos desde cli como con 

~~~
mvn archetype:generate -DgroupId=com.udemy.app -DartifactId=mi-proyecto -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
~~~

y tambien desde IDE's como intellij o Eclipse

## Ciclio de vida por default 
- validate
- compile 
- test 
- package
- verify
- install 
- deploy

![Ciclo de vida](/java/Udemy-ids/middleware-jr/maven/1GenerarProyecto/images/cicloMVN.png)

## POM.xml y Settings

Elementos basicos de un pom.xml
- groudID
- artifactId
- version
- packaging
- dependencies
- parent
- properties
- modules


Elementos basicos de settings (archivo de configuracion)
- localRepository
- offline
- proxies
- mirror
- repositories
- pluginRepositories
- Servers

## Plugins
- Clean
- Compiler
- Surefire
- Resources
- JaCoCo
- SonarQube

![MVN plugins](/java/Udemy-ids/middleware-jr/maven/1GenerarProyecto/images/mvnPlugins.png)


