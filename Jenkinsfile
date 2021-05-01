pipeline{
    environment {
		registry = 'samnur82/BookLandLogin'
		registryCred = 'my_dockerhub'
		dockerImage = ''
    }

    agent any

    stages {
        stage('Check Prerequisite') {
            steps {
                sh 'git --version | ant -version | java -version | docker --version'
            }
        }
        stage('clone repo') {
            steps {
               sh 'git pull'
            }
        }
        stage('Build BookLandLogin War') {
            steps{
                sh 'ant -Dj2ee.server.home=/opt/tomcat9 -Dlibs.CopyLibs.classpath=/opt/AntAdditionalJars/org-netbeans-modules-java-j2seproject-copylibstask.jar -Dfile.reference.mysql-connector-java-8.0.17.jar=/opt/AntAdditionalJars/mysql-connector-java-8.0.17.jar clean compile dist'
            }
        }
        stage('Build BookLandLogin Docker Image') {
            steps{
	 	script {
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
		}
            }
        }
    }
}

