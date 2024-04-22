pipeline {
    agent any
    
    stages {
        stage('Build') {
            parallel {
                stage('Build Project A') {
                    steps {
                        echo 'Building Project A...'
						echo "build complete"
                    }
                }
                stage('Build Project B') {
                    steps {
                        echo 'Building Project B...'
                        echo "build complete"
                    }
                }
            }
        }
        
        stage('Test') {
            parallel {
                stage('Test Project A') {
                    steps {
                        echo 'Testing Project A...'
                        echo "Testing completed"
                    }
                }
                stage('Test Project B') {
                    steps {
                        echo 'Testing Project B...'
                        echo "Testing completed"
                    }
                }
            }
        }
        
        stage('Check Dependencies') {
            parallel {
                stage('Check Project A Dependencies') {
                    steps {
                        echo 'Checking Project A Dependencies...'
                        echo "here we are good to go"
                    }
                }
                stage('Check Project B Dependencies') {
                    steps {
                        echo 'Checking Project B Dependencies...'
                        echo "here we are good to go"
                    }
                }
            }
        }
        
        stage('Run') {
            parallel {
                stage('Run Project A') {
                    steps {
                        echo 'Running Project A...'
                        echo"Run Successfully"
                    }
                }
                stage('Run Project B') {
                    steps {
                        echo 'Running Project B...'
                        echo"Run Successfully"
                    }
                }
            }
        }
    }
}
