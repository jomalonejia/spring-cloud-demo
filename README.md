# spring-cloud-demo
### this demo is the easiest tutorial of spring cloud config eureka zuul 
### it also shows that deploying of docker
> the demo contains 4 services
- config:8888
- registry(eureka):8761
- gateway(zuul):8080
- service-1:8080

## Deployment
> pre
-   load the sql file 
-   change the database host and port
-   ...
> localhost run
-   run config --> registry --> service-1 --> gateway
-   
> docker run
-   cd spring-cloud-demo
-   docker-compose build (build images)
-   docker-compose up -d config (run config)
-   docker-compose up -d (run other services)
-   docker-compose logs (print logs)

## test
- [localhost:8080/service-1/test](localhost:8080/service-1/test) you would return success response