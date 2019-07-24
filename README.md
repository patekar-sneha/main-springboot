# main-springboot


DOCKER BUILD COMMAND:

docker build -t spring-docker .

gcloud auth: gcloud auth configure-docker

DOCKER GOOGLE CLOUD: docker tag spring-docker gcr.io/spring-kube/spring-docker

DOCKER PUSH TO GOOGLE CLOUD: docker push gcr.io/spring-kube/spring-docker

DELETE IMAGE FROM GCE: gcloud container images delete gcr.io/spring-kube/spring-docker

Useful Docker commands docker images docker container ls docker logs <container_name> docker container rm <container_name docker image rm <image_name
