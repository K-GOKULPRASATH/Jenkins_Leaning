pipeline {
    agent any
    environment{
        DOCKER_IMAGE="jenkins-pipeline-image"
        DOCKER_CONTAINER="pipeline-container"
    }
    stages{
        stage('Clone GitHub Repository'){
            steps{
                git branch: 'main', credentialsId: 'K-GOKULPRASATH', url: 'https://github.com/K-GOKULPRASATH/Jenkins_Leaning.git'
            }

        }
        stage('List the files Cloned form the GitHub Repository'){
            steps{
                sh 'ls'
            }
        }
        stage('Run maven Tests'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Build maven'){
            steps{
                sh 'mvn clean install -DskipTests=true'
            }
        }
        stage('Packageing to .jar file'){
            steps{
                sh 'mvn clean package -DskipTests=true'
            }
        }
        stage('Building Docker Image for the jar file'){
            steps{
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }
        stage('Remove the Old container if exists'){
            steps{
                sh 'docker rm -f $DOCKER_CONTAINER || true'
            }
        }
        stage('Run the Docker Container'){
            steps{
                sh 'docker run -d -p 8082:8081 --name $DOCKER_CONTAINER $DOCKER_IMAGE'
            }
        }
    }
}