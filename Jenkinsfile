pipeline {
    agent any
     parameters {
        choice(
            name: 'BROWSER',
            choices: ['chrome', 'firefox'],
            description: 'Select browser to run tests'
        )
        booleanParam(
        name: 'HEADLESS',
        defaultValue: false,
        description: 'Run browser in headless mode'
    )
    }

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/Snehanshu-Personal/Automation-Framework-TDD.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat "mvn clean test -Dbrowser=${params.BROWSER} -Dheadless=${params.HEADLESS}"
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution completed'
        }

        success {
            echo 'Build SUCCESS'
        }

        failure {
            echo 'Build FAILED'
        }
    }
}
