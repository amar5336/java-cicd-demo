# Java CI/CD Demo

A simple Java program (adds two numbers) with a GitHub Actions pipeline:
**push -> build -> test -> Docker image -> Docker Hub**.

## Run locally
```
mvn clean test          # run TestNG tests
mvn clean package       # build target/app.jar
java -jar target/app.jar
docker build -t java-cicd-demo . && docker run --rm java-cicd-demo
```

## One-time GitHub setup
Create a Docker Hub access token (Account Settings > Security > New Access Token), then in your
GitHub repo go to **Settings > Secrets and variables > Actions > New repository secret** and add:

| Secret | Value |
|---|---|
| `DOCKERHUB_USERNAME` | your Docker Hub username |
| `DOCKERHUB_TOKEN` | the access token |

## Push
```
git init
git add .
git commit -m "Add Java CI/CD pipeline"
git branch -M main
git remote add origin https://github.com/<USERNAME>/java-cicd-demo.git
git push -u origin main
```
Then open the repo's **Actions** tab to watch the run.
