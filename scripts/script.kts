import java.io.File

"pwd".runCommandWithRedirect()
"git status".runCommandWithRedirect()


fun String.runCommandWithRedirect(dir: File? = null): Int {
    return ProcessBuilder("/bin/sh", "-c", this)
        .redirectErrorStream(true)
        .inheritIO()
        .directory(dir)
        .start()
        .waitFor()
}
