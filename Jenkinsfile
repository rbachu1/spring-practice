pipeline{
    agent any
        stages {
            stage('Stage 1'){
                steps {
                echo "Hello !! This is Springboot practice repo !! Jenkins"
                }
            }
            stage('Stage 2'){
              when {
                    branch "user*"
                    }
                steps {
                       echo "Considering only user related branches !!!"
                       }
            }
            stage('Stage 3'){
                steps{
                echo "Webhook added !!"
                }
            }
       }
  }
