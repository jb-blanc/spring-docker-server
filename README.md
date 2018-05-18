# Spring docker server

## Installation

Commandes à lancer
```
docker build -t spring-docker-server .

docker run -it -v D:/Development/docker/springServer/shared:/data/springdockerserver -p 8081:8080 --name spring-application spring-docker-server
```

## Fonctionnement

L'application partage un dossier (shared) avec le système hôte qui sera monter sur le /data/springdockerserver du container.

## Urls disponibles : 
GET / => donne un status de l'application

    {
        state: "ON",
        startedAt: "2018-05-17T13:33:00.000+0000"
    }

GET /infos => récupère les infos stockées dans le fichier partagé

    [
        {
            "id":1,
            "name": "Infos de ouf",
            "publishDate":"2018-05-17T13:33:00.000+0000"
        }, ...
    ]