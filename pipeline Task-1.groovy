pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Stage 1: Build - Compiling and packaging the code using Maven'
                echo 'Tool used: Maven'
            }
        }

        stage('Unit and Integration Tests') {
            steps {
                echo 'Stage 2: Unit and Integration Tests - Running tests using JUnit and TestNG'
                echo 'Tools used: JUnit, TestNG'
            }
        }

        stage('Code Analysis') {
            steps {
                echo 'Stage 3: Code Analysis - Analyzing code quality with SonarQube'
                echo 'Tool used: SonarQube'
            }
        }

        stage('Security Scan') {
            steps {
                echo 'Stage 4: Security Scan - Scanning for vulnerabilities using OWASP Dependency-Check'
                echo 'Tool used: OWASP Dependency-Check'
            }
        }

        stage('Deploy to Staging') {
            steps {
                echo 'Stage 5: Deploy to Staging - Deploying application to staging environment on AWS EC2'
                echo 'Tools used: Ansible, SSH, AWS CLI'
            }
        }

        stage('Integration Tests on Staging') {
            steps {
                echo 'Stage 6: Integration Tests on Staging - Running end-to-end tests in staging environment'
                echo 'Tools used: Postman (Newman CLI), Selenium'
            }
        }

        stage('Deploy to Production') {
            steps {
                echo 'Stage 7: Deploy to Production - Deploying application to production environment on AWS EC2'
                echo 'Tools used: Ansible, SSH, AWS CLI'
            }
        }
        stage('End') {
            steps {
                echo 'Done-- No stage'
            }
        }
    }
}
