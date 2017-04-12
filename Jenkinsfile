pipeline {
  agent {
    dockerfile {
      filename 'Docker/Dockerfile'
    }
    
  }
  stages {
    stage('Check Status') {
      steps {
        sh 'echo $?'
      }
    }
  }
}