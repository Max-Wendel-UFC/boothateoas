# BootHateoas

## O Sistema
- Sistema simplíssimo, somente para estudo.

## Servidor
- O servidor embutido padrão da aplicação é o _undertown_, se quiser trocar para o _tomcat_ apague a tudo que está entre a (e a própria) tag _exclusions_:
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
	<exclusions>
		<exclusion>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
		</exclusion>
	</exclusions>
</dependency>
```
- Em seguida, comente o trecho que adiciona o _undertown_:
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-undertow</artifactId>
</dependency>
```
## Perfil da aplicação
- Todos os perfis da aplicação podem ser visualizados no arquivo [`application.yaml`](https://github.com/Max-Wendel-UFC/boothateoas/blob/master/src/main/resources/application.yaml). O perfil padrão segue as seguintes configurações:
```yaml
server:
  port: 9080

spring:
  security:
    user:
      name: guest
      password: guest123
```
- Trocando para o perfil _development_
```sh
mvn -Dspring.profiles.active=development install
```
- Trocando para o pefril _production_
```sh
mvn -Dspring.profiles.active=production install
```
## Rodando a aplicação
- Para rodar a aplicação use o comando:
```sh
mvn clean install spring-boot:run
```
- Entre com o `name` e `password` do perfil selecionado.
- Ao se logar, você será redirecionado a página do _HAL BROWSER_.
## Testando uma requisição:
- Use o seguinte path no Campo _Explorer_:
```
/greeting?name=HATEOAS
```


