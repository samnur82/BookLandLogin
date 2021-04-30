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
               sh 'git pull https://github.com/samnur82/BookLandLogin.git'
            }
        }
        stage('Build Simple Apps War') {
            steps{
	        sh 'ant -Dj2ee.server.home=/opt/tomcat9 -Dlibs.CopyLibs.classpath=/root/nblibrary clean compile'
                sh 'ant -Dj2ee.server.home=/opt/tomcat9 -Dlibs.CopyLibs.classpath=/root/nblibrary dist'
            }
        }	
    }
}

