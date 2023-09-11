# Getting Started

## Sample Usage
- `./mvnw package`
- `java -jar ./target/app-0.0.1-SNAPSHOT.jar`
- **EndpointUsage**
## Docker Usage
- `docker build -t sample-java-app .`
- `docker run -p 9001:9001 -t sample-java-app`
- **EndpointUsage**

## Endpoint Usage
You can plug in any number of parameters with `&` between them, also you can use any key name in place of `<param_name>` slots.
- `http://localhost:9001/api/query?<param_name1>=<val1>&<param_name2>=<val2>&...`

#### Example Usage:
`http://localhost:9001/api/query?test=val&string=test`

will output the following response:

`Query parameters: test = val, string = test,`




### Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.1/maven-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.1/maven-plugin/reference/html/#build-image)
- [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.1/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides

The following guides illustrate how to use some features concretely:

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
