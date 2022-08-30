node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    //def mvn = tool 'Default Maven';
    withSonarQubeEnv() {
      "mvn clean verify sonar:sonar -Dsonar.projectKey=Sonar-Jenkins"
    }
  }
}
