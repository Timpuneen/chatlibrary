# chatlibrary
Android library that provides a plug-and-play chat interface with WebSocket integration, styled like a modern messenger

# ChatLibrary for Android

## Installation

To use **ChatLibrary** in your project, follow these steps:

### 1. Add the repository to your `build.gradle` file

In your root `build.gradle` file, add the GitHub Packages repository:

```gradle
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/Timpuneen/chatlibrary")
        credentials {
            username = "Timpuneen"
            password = "Secretik(token)"
        }
    }
}

dependencies {
    implementation("com.github.Timpuneen:chatlibrary:1.0.0")
}
