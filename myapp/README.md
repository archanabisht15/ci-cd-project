# myapp - Simple Maven WAR for Jenkins + Tomcat

Build locally:  mvn clean package
Result:         target/myapp.war
Deploy:         copy myapp.war to Tomcat webapps folder
Open:           http://<server-ip>:8080/myapp/

Requirements: Java 17, Maven 3.6.3+, Tomcat 9 or 10
