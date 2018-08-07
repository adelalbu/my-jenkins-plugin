
def isStageSkipable(String stageName) {
    def gitDir = "$JENKINS_HOME/workspace/git"

    println($JENKINS_HOME)

    File folder = new File(gitDir)
    File[] listOfFiles = folder.listFiles()

    for (File file : listOfFiles) {
        if (file.getName().equals(stageName))
            return true
    }
    return false
}

def call(String stageName) {
   return isStageSkipable(stageName)
}