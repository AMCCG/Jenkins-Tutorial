pipeline {
    agent any

    stages {
        stage('One') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Two') {
            steps {
                echo 'Hello World 2'
            }
        }
        stage('Three') {
            steps {
                echo 'Hello World 3'
            }
        }
    }
}
