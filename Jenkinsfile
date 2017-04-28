
parallel (
	"stream1" : node {
	    checkout scm
	    withEnv(["JAVA_HOME=${ tool 'JDK8' }", "PATH+MAVEN=${tool 'Maven'}/bin:${env.JAVA_HOME}/bin"]) {
    		sh 'mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/sampleTestSuite.xml'
		}
	}, 
	
	"stream2" : node {
		checkout scm
	    withEnv(["JAVA_HOME=${ tool 'JDK8' }", "PATH+MAVEN=${tool 'Maven'}/bin:${env.JAVA_HOME}/bin"]) {
    		sh 'mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/appTestTestSuite.xml'
		}
	}
)