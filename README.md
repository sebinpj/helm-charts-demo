# Helm and K8S demo

This project is used to demo kubernetes and helm charts using a very basic spring boot project and a simple helm chart

## Pre-requisites

- Helm
- Java 11+
- Maven
- Docker (With Kubernetes enabled)

## How to run this project

- Build this project using
```shell
mvn package
```  
- Build docker image using 
```shell
docker build -t kube-demo .
```
- Install the application onto your kubernetes cluster using helm
```shell
helm upgrade --install kube-demo helm --create-namespace -n kube-demo
```