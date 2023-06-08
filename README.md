# springboot3

what is pom.xml? 
pom is a XML file that contains information about the project and configuration details used by Maven to build the project. When executing a task or goal, Maven looks for the POM in the current directory. It reads the POM, gets the needed configuration information, then executes the goal


What is tomcat?
Provides a pure java HTTP web server environment in which Java code can also run. It is a Java web application server

Spring boot folder layouts 

Main- resources- static/templates
 - used for web development html css and javasript 

 application.properties- enviroment specific properties 


 @Requestmaping- for a class level route 
 @Getmapping- method level route 



 The service component ensures that the class file which incorporates business logic in a different layer and keeps it separated from the @RestController class file.

 @Autowired annotation 
 -It allows Spring to resolve and inject collaborating beans into our bean.
 -is used for automatic dependency injection. Spring framework is built on dependency injection and we inject the class dependencies through spring bean configuration file.