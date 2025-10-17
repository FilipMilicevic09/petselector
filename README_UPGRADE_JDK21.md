Upgrade instructions to Java 21 (LTS)

This small project is currently a single-file Java program: Petselector.java

Goal: Run and build the project using Java 21.

Steps to upgrade locally:

1. Install a Java 21 JDK
- Linux (Debian/Ubuntu):
  sudo apt update
  sudo apt install -y wget tar
  wget https://github.com/adoptium/temurin21-binaries/releases/latest/download/OpenJDK21U-jdk_x64_linux_hotspot_21.tar.gz -O /tmp/jdk21.tar.gz
  sudo mkdir -p /usr/lib/jvm
  sudo tar -xzf /tmp/jdk21.tar.gz -C /usr/lib/jvm
  # set JAVA_HOME to the unpacked folder, e.g. /usr/lib/jvm/jdk-21

- Using SDKMAN (recommended):
  curl -s "https://get.sdkman.io" | bash
  source "$HOME/.sdkman/bin/sdkman-init.sh"
  sdk install java 21.0.0-tem
  sdk use java 21.0.0-tem

2. Verify installed java:

   java -version
   # should show java 21

3. Update VS Code Java runtime (optional):
- Open `.vscode/settings.json` and set the `path` value under `java.configuration.runtimes` to your JDK 21 installation path. If you used SDKMAN, the path is usually under `$HOME/.sdkman/candidates/java/current`.

4. Build and run:

   javac Petselector.java
   java Petselector

5. Notes and troubleshooting:
- If you use extensions that hardcode a different JDK, update their settings.
- For CI, update the action to use `actions/setup-java` with `java-version: '21'`.

If you'd like, I can attempt to modify project files, detect a package manager, or create a Git branch and open a PR with the automated changes. Let me know which you prefer.
