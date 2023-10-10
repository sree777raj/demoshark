FROM tomcat:9.0.46-jdk11-openjdk
COPY dataFiles /usr/local/tomcat/dataFiles/
COPY config/tomcat/server.xml /usr/local/tomcat/conf/server.xml
COPY target/fdxapi##dc-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
COPY fdx-ri-tdm/target/adminui##dc-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
