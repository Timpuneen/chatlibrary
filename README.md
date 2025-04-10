# chatlibrary
Android library that provides a plug-and-play chat interface with WebSocket integration, styled like a modern messenger

# ChatLibrary for Android

## Installation

To use **ChatLibrary** in your project, follow these steps:

### 1. Add the repository to your `build.gradle` file

In your `settings.gradle.kts` file, add the GitHub Packages repository:

```settings.gradle
pluginManagement {
    repositories {
        ...
        maven {
            url = uri("https://maven.pkg.github.com/Timpuneen/chatlibrary")
            credentials {
                username = "Timpuneen"
                password = "secretik"
            }
        }
        ...
    }
}
dependencyResolutionManagement {
    ...
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/Timpuneen/chatlibrary")
            credentials {
                username = "Timpuneen"
                password = "secretik"
            }
        }
        ...
    }
}

....

```

### 2. Add the package implementation to your `build.gradle` file

In your `build.gradle.kts(app)` file, add the dependency implementation:

```build.gradle

dependencies {
    implementation("com.github.Timpuneen:chatlibrary:1.0.0")
    ...
}

```

### 3. Realise the start method

----------- com.example.chatlibrary.ChatLibrary.start(this) -----------

for instance(MainActivity.kt):

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            com.example.chatlibrary.ChatLibrary.start(this)
        }
    }
