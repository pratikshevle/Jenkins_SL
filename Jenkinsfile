@Library(Shared_Libraries) _

pipeline{
    agent any
    stages { 
        stage('Building Application) {
            steps {
                buildApp()
            }
        }
        stage('Creating Docker'){
            steps {
                dockerBuild("python","1.0.${env.BUILD_NUMBER}")
            }
        }
        stage('Deploy') {
            steps {
                k8sDeploy("k8s/deployment.yaml")
            }
        }
}
