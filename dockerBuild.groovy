def call(String imageName, String imageTag = "latest") {
    stage('Docker Build & Push') {
        echo "Building Docker Image: ${imageName}:${imageTag}"
        sh """
            docker build -t ${imageName}:${imageTag} .
            docker push ${imageName}:${imageTag}
        """
        echo "Docker image push successfully"    
    }
}
