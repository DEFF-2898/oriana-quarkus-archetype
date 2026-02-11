import java.nio.file.*

def projectDir = new File(request.outputDirectory, request.artifactId)
def gitignore = new File(projectDir, "gitignore")
def dotGitignore = new File(projectDir, ".gitignore")

if (gitignore.exists() && !dotGitignore.exists()) {
    Files.move(gitignore.toPath(), dotGitignore.toPath(), StandardCopyOption.REPLACE_EXISTING)
    println "Renamed gitignore -> .gitignore"
}
