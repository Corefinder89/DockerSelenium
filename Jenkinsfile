pipeline {
  agent {
    dockerfile {
      filename 'Docker/Dockerfile'
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