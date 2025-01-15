# Currency Converter App

This is a currency converter application built using modern Android development practices and technologies. It allows users to convert between different currencies using real-time exchange rates.
[![Watch the demo video]](https://drive.google.com/file/d/1CGnOeKF2ovV8j3t0qHyZV3mmFX-a4u84/view?usp=drive_link)

## Features

-   Convert between various currencies.
-   Displays real-time exchange rates.
-   Offline support using local database caching.
-   Clean and intuitive user interface.

## Architecture

This app follows a clean architecture pattern, dividing the system into three distinct layers:

1.  **Presentation Layer:**
    -   Responsible for the UI and user interactions.
    -   Built using Jetpack Compose for a declarative and modern UI.
    -   Contains ViewModels to manage UI state and logic.
    -   Observes data from the Domain layer and updates the UI accordingly.
2.  **Domain Layer:**
    -   Contains the business logic and use cases of the application.
    -   Defines the core entities and interfaces.
    -   Independent of any specific framework or implementation details.
    -   Uses Kotlin coroutines for asynchronous operations.
3.  **Data Layer:**
    -   Responsible for data access and management.
    -   Handles data retrieval from both remote and local sources.
    -   Uses Retrofit for network requests to fetch currency rates.
    -   Uses Room for local database storage and caching.
    -   Implements repositories to abstract data sources.

## Technologies Used

-   **Jetpack Compose:** For building the user interface with a declarative approach.
-   **Retrofit:** For making network requests to fetch currency exchange rates.
-   **Dagger-Hilt:** For dependency injection, making the code more modular and testable.
-   **Room:** For local database storage and caching of currency rates.
-   **Kotlin Coroutines:** For asynchronous operations and managing background tasks.
-   **Clean Architecture:** For organizing the codebase into distinct layers with clear responsibilities.
-   **MVVM (Model-View-ViewModel):** For managing UI state and logic in the presentation layer.

## Setup Instructions

1.  **Clone the repository**
2.  **Open the project in Android Studio:**
    -   Launch Android Studio.
    -   Select `Open an existing project`.
    -   Navigate to the cloned repository and select the root directory.
3.  **Configure API Key:**
    -   Obtain an API key from [Free Currency API](https://freecurrencyapi.com/).
    -   Replace your API key at CurrencyAPI.
4.  **Build and Run:**
    -   Select the `app` configuration.
    -   Click the `Run` button to build and run the application on your emulator or device.

## Dependencies

The following dependencies are used in this project:

-   `androidx.core:core-ktx`
-   `androidx.appcompat:appcompat`
-   `com.google.android.material:material`
-   `androidx.constraintlayout:constraintlayout`
-   `androidx.compose.ui:ui`
-   `androidx.compose.material3:material3`
-   `androidx.compose.ui:ui-tooling-preview`
-   `androidx.lifecycle:lifecycle-runtime-ktx`
-   `androidx.activity:activity-compose`
-   `androidx.compose:compose-bom`
-   `androidx.room:room-runtime`
-   `androidx.room:room-ktx`
-   `com.squareup.retrofit2:retrofit`
-   `com.squareup.retrofit2:converter-gson`
-   `com.google.dagger:hilt-android`
-   `com.google.dagger:hilt-android-compiler`
-   `org.jetbrains.kotlinx:kotlinx-coroutines-android`

## Challenge

-   Synchronize dependency versions.
-   First time getting acquainted with jetpack compose.
-   API handling isn't good.
