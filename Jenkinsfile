pipeline {
	agent any

	stages {
		stage("Launch Checkmarx scan") {
			
			post {
				success {
					echo "Succed in Scanning"
				}
				failure {
					echo "Failed in Scanning"
				}
			}
		}
		stage("Build DemoTest") {
			steps {
				echo "Building begining..."
				sh "mvn clean package"
			}
			post {
				success {
					echo "Succed in Building"
				}
				failure {
					echo "Failed in bootstrap"
				}
			}
		}

		
	}
	post {
		success {
			echo "Success"
		}
		failure {
			echo "Failed"
		}
	}
}
