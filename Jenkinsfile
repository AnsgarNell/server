node {
    docker.image('maven:3-alpine').inside('-v $HOME/.m2:/root/.m2') {
        stage('Build') {
            sh 'mvn -B clean package'
        }
        stage('Test') {
            sh 'mvn test'
        }
        stage('Stash jar file') {
            stash includes: 'target/server-0.0.1-SNAPSHOT.jar', name: 'binary'
        }
    }
}
node {
    stage('Unstash jar file') {
        unstash 'binary'
    }
    stage('Build and push Docker image') {
        def customImage = docker.build "ansgarnell/basic-server"
        docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
            customImage.push("$BUILD_NUMBER")
            customImage.push("latest")
        }
    }
}