def call(String manifestPath) {
    stage('Kubernetes Deploy') {
        echo "Deploying to kubernetes using manifest: ${manifestPath}"
        sh "kubectl apply -f ${manifestPath}"
        sh "kubectl rollout status deployment/my-app --timeout=120s"
        echo "Kubernetes deplyoment successful!"
    }
}
