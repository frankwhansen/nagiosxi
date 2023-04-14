pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Running build step...'
                // Add your build steps here
                // For example:
                sh 'echo "Build step executed"'
            }
        }
        stage('Test') {
            steps {
                echo 'Running test step...'
                // Add your test steps here
                // For example:
                sh 'echo "Test step executed"'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Running deploy step...'
                // Add your deploy steps here
                // For example:
                sh 'echo "Deploy step executed"'
            }
        }
    }
}
