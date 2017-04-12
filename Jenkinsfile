pipeline {
  agent {
    docker {
      image 'corefinder/docker-selenium'
    }
    
  }
  stages {
    stage('DockerImageBuild') {
      steps {
        sh 'docker build -t docker-selenium .'
      }
    }
  }
}