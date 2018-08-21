# jib-demo

## 1 Export to a Docker context
```
% mvn compile jib:exportDockerContext
```

## 2 Build image with Docker
```
% sudo docker build -t jib-demo-image target/jib-docker-context
```

## 3 New an container and run
```
% sudo docker run -d --name jib-demo-1 jib-demo-image
```

## 4 Terminal session
[![asciicast](https://asciinema.org/a/197359.png)](https://asciinema.org/a/197359)