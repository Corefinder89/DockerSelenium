pipeline {
  agent any
  stages {
    stage('Build from Dockefile') {
      steps {
        sh '''cd Docker
docker build -t dockselenium .'''
      }
    }
  }
}