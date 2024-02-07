# DevOps-Project
Repository for the Continuous Integration and Continuous Delivery course.

- Building the docker image: docker build -t="idodikj/web:v1" .
- Orchestration: docker compose up
- Kubernetes commands:
  - k3d cluster create devopscluster -p "8080:80@loadbalancer"
  - kubectl apply -f namespace.yaml
  - kubectl apply -f postgres.yaml
  - kubectl apply -f spring.yaml
  - kubectl config set-context --current --namespace=devops
  - Access localhost:8080 in the browser
