node {
    checkout scm
    sh 'mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/sampleTestSuite.xml'
}
node {
    checkout scm
	sh 'mvn clean test -DsuiteXmlFile=src/test/java/com/cisco/test/jenkinsTest/appTestTestSuite.xml'
}