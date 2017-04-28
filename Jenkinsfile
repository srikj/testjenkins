
parallel (
	"stream1" : node {
		env.PATH = "${tool 'maven-3.5.0'}/bin:${env.PATH}"
		def pom = readMavenPom file: 'pom.xml'
	    checkout scm
	    sh 'mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/sampleTestSuite.xml'
	}, 
	
	"stream2" : node {
		env.PATH = "${tool 'maven-3.5.0'}/bin:${env.PATH}"
		def pom = readMavenPom file: 'pom.xml'
	    checkout scm
		sh 'mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/appTestTestSuite.xml'
	}
)