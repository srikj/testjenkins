
parallel (
	"stream1" : node {
		def mvnHome = tool 'Maven'
		def pom = readMavenPom file: 'pom.xml'
	    checkout scm
	    sh '${mvnHome}/bin/mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/sampleTestSuite.xml'
	}, 
	
	"stream2" : node {
		def mvnHome = tool 'Maven'
		def pom = readMavenPom file: 'pom.xml'
	    checkout scm
		sh '${mvnHome}/bin/mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/appTestTestSuite.xml'
	}
)