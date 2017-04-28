def mvnHome = tool 'maven-3.3.9'
// we want to pick up the version from the pom
def pom = readMavenPom file: 'pom.xml'
parallel (
	"stream1" : node {
	    checkout scm
	    sh '${mvnHome}/bin/mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/sampleTestSuite.xml'
	}, 
	
	"stream2" : node {
	    checkout scm
		sh '${mvnHome}/bin/mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/appTestTestSuite.xml'
	}
)