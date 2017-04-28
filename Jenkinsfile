parallel (
	"stream1" : node {
	    checkout scm
	    sh 'mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/sampleTestSuite.xml'
	}, 
	
	"stream2" : node {
	    checkout scm
		sh 'mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/appTestTestSuite.xml'
	}
)