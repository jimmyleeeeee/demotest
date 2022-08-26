pipeline {
	agent any

	stages {
		stage("Launch Checkmarx scan") {
			steps {
				step([$class: 'CxScanBuilder', avoidDuplicateProjectScans: true, comment: '', configAsCode: true, credentialsId: '', customFields: '', excludeFolders: '', exclusionsSetting: 'global', failBuildOnNewResults: false, failBuildOnNewSeverity: 'HIGH', filterPattern: '''!**/_cvs/**/*, !**/.svn/**/*, !**/.hg/**/*, !**/.git/**/*, !**/.bzr/**/*,
					!**/.gitgnore/**/*, !**/.gradle/**/*, !**/.checkstyle/**/*, !**/.classpath/**/*, !**/bin/**/*,
					!**/obj/**/*, !**/backup/**/*, !**/.idea/**/*, !**/*.DS_Store, !**/*.ipr, !**/*.iws,
					!**/*.bak, !**/*.tmp, !**/*.aac, !**/*.aif, !**/*.iff, !**/*.m3u, !**/*.mid, !**/*.mp3,
					!**/*.mpa, !**/*.ra, !**/*.wav, !**/*.wma, !**/*.3g2, !**/*.3gp, !**/*.asf, !**/*.asx,
					!**/*.avi, !**/*.flv, !**/*.mov, !**/*.mp4, !**/*.mpg, !**/*.rm, !**/*.swf, !**/*.vob,
					!**/*.wmv, !**/*.bmp, !**/*.gif, !**/*.jpg, !**/*.png, !**/*.psd, !**/*.tif, !**/*.swf,
					!**/*.jar, !**/*.zip, !**/*.rar, !**/*.exe, !**/*.dll, !**/*.pdb, !**/*.7z, !**/*.gz,
					!**/*.tar.gz, !**/*.tar, !**/*.gz, !**/*.ahtm, !**/*.ahtml, !**/*.fhtml, !**/*.hdm,
					!**/*.hdml, !**/*.hsql, !**/*.ht, !**/*.hta, !**/*.htc, !**/*.htd, !**/*.war, !**/*.ear,
					!**/*.htmls, !**/*.ihtml, !**/*.mht, !**/*.mhtm, !**/*.mhtml, !**/*.ssi, !**/*.stm,
					!**/*.bin,!**/*.lock,!**/*.svg,!**/*.obj,
					!**/*.stml, !**/*.ttml, !**/*.txn, !**/*.xhtm, !**/*.xhtml, !**/*.class, !**/*.iml, !Checkmarx/Reports/*.*,
					!OSADependencies.json, !**/node_modules/**/*''', fullScanCycle: 10, generatePdfReport: true, groupId: '1', incremental: true, password: '{AQAAABAAAAAQDG/UkDfZv5BDOmbSfYqPKC24kskPqqt8ycGx0iiBsO0=}', preset: '36', projectName: 'DemoTest', sastEnabled: true, serverUrl: 'https://Coupang.checkmarx.net', sourceEncoding: '6', username: '', vulnerabilityThresholdResult: 'FAILURE'])
			}
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
