pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
               git 'https://github.com/testautomation112020/qa.git'
            }
        }
        stage('run') {
            steps {
                sh "mvn clean test"
            }
        }

    }
}