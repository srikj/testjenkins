pipeline {
    agent { docker 'maven:3.3.3' }
    checkout scm
    stages {
        stage('test') {
	        parallel {
		    	'sampleTest' : {sh 'mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/sampleTestSuite.xml'},
		    	'appTest' : {sh 'mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/appTestTestSuite.xml'}
		  	}
        }
    }
}