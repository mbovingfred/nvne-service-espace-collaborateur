FROM openjdk:8-jdk-alpine
VOLUME /tmp

# Creation du répertoire de stockage des téléchargements
RUN mkdir /root/upload
# RUN mkdir /root/upload/cv

# Adding backend to container
ADD target/service-espace-collaborateur*.jar /app.jar

CMD [ "java", "-jar", "/app.jar", "-Dspring.profiles.active=prod" ]

# Exposing container port for binding with host
EXPOSE 8081