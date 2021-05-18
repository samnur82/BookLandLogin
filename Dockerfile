# use tomcat-java base images
FROM tomcat:jdk8-openjdk

# copy apps war file into webapps tomcat directory
COPY dist/BookLandLogin2.war /usr/local/tomcat/webapps/

# start the apps container
CMD ["catalina.sh", "run"]
