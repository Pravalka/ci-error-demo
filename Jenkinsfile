pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh '''
                    mkdir -p build
                    javac -d build src/com/example/UserService.java
                '''
            }
        }

        stage('Test') {
            steps {
                echo 'This won’t run due to compile error above.'
            }
        }
    }

    post {
        failure {
            echo "❌ CI failed — check error logs"
        }
    }
}
