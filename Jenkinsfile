/* pipeline{
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
*/

pipeline

agent any

stages{
    
    stage('stage 1'){
        
        steps{
                sh 'echo "Hello World"'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''   
        }    
    }
    
}
