pipeline {
  agent {
    dockerfile {
      filename 'Docker/Dockerfile'
    }
    
  }
  stages {
    stage('DockerImageBuild') {
      steps {
        sh 'mvn clean'
      }
    }
  }
}