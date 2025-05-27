# KewlPaper
A fork of the ever famous Paper server software, adding in some pvp changes and overall making paper kewler.

# Download
To setup KewlPaper usage with maven, put the following in your pom.xml

##### Maven
```xml
<dependencies>
    <dependency>
        <groupId>dev.ianrich</groupId>
        <artifactId>kewlpaper-api</artifactId>
        <version>1.21.5-R0.1-SNAPSHOT</version>
        <scope>provided</scope>
    </dependency>
</dependencies>

```

##### Gradle
```kotlin
dependencies {
    compileOnly("dev.ianrich:kewlpaper-api:1.21.5-R0.1-SNAPSHOT")
}
```

# Compilation
To compile KewlPaper, you need JDK 21 and an internet connection.

Clone this repo, run `./gradlew applyPatches`, then `./gradlew createMojmapBundlerJar` from your terminal. You can find the compiled jar in the `kewlpaper-server/build/libs` directory.

To get a full list of tasks, run `./gradlew tasks`.

# Changes
soonTM

# Credit
Thanks to the team over at Paper for providing this fork of Spigot to everyone, we currently don't use any patches from other sources outside of here.

**This spigot is free for everyone, feel free to contribute if you want to!**
