def call() {
    stage('Build and Deploy') {
        echo "Starting application build..."
        sh "mvn clean install -DskipTests=false"
        echo "Build and Unit Tests Completed!"
    }
}
