node {
  checkout scm
  stash name: 'sources', includes: 'pom.xml,src/'
}
stage 'Run Tests'
def splits = ["src/test/java/com/cisco/test/jenkinsTest/sampleTestSuite.xml", "src/test/java/com/cisco/test/jenkinsTest/appTestSuite.xml"]
def branches = [:]
for (int i = 0; i < splits.size(); i++) {
  def index = i // fresh variable per iteration; i will be mutated
  branches["suite ${i}"] = {
    node {
      deleteDir()
      unstash 'sources'
      withEnv(["JAVA_HOME=${ tool 'JDK8' }", "PATH+MAVEN=${tool 'Maven'}/bin:${env.JAVA_HOME}/bin"]) {
		sh "mvn clean test -DtestFailureIgnore=true -Dmaven.test.failure.ignore=true -DsuiteXmlFile=${splits.get(index)}"
	  }
      junit 'target/surefire-reports/*.xml'
    }
  }
}
parallel branches