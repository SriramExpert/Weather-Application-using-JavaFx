# 🌦️ Weather Application (JavaFX + REST API)

A simple **JavaFX desktop application** that fetches real-time weather data from a **public REST API** (OpenWeatherMap) and displays it in a clean, user-friendly interface.  

This project demonstrates how to:
- Make HTTP requests in Java  
- Parse JSON responses  
- Display dynamic data using JavaFX GUI  

---

## 🧩 Features

✅ Fetches current weather data by city name  
✅ Displays temperature, humidity, and weather description  
✅ Clean and responsive JavaFX interface  
✅ Handles API errors gracefully  
✅ Demonstrates REST API integration in Java  

---

## 🏗️ Project Structure
```bash
Weather_Application/
│
├── pom.xml                    # Maven project descriptor
├── README.md                  # Project documentation
│
└── src/
    └── main/
        ├── java/
        │   └── com/weatherapp/
        │       ├── Main.java              # Entry point (launches JavaFX)
        │       ├── WeatherApp.java        # UI and event handling
        │       ├── WeatherService.java    # Handles REST API calls
        │       └── WeatherData.java       # Data model for weather info
        │
        └── resources/
            └── application.css            # Optional stylesheet


```

## ⚙️ Technologies Used

| Component | Technology |
|------------|-------------|
| GUI | JavaFX |
| HTTP Requests | `HttpURLConnection` |
| JSON Parsing | `org.json` (JSON-Java library) |
| Build Tool | Maven |
| API | OpenWeatherMap API |

---

## 🚀 Getting Started

### 1️⃣ Prerequisites
Make sure you have:
- **Java 17 or later**
- **Maven 3.8+**
- **Internet connection** (for API calls)

---

### 2️⃣ Clone the Repository

```bash
git clone https://github.com/yourusername/Weather_Application.git
cd Weather_Application
```

### 3️⃣ Add Your OpenWeatherMap API Key

Open the file:

```bash
src/main/java/com/weatherapp/WeatherService.java
```

Replace the following line:
```bash
private static final String API_KEY = "YOUR_API_KEY_HERE";

```
with your own key from OpenWeatherMap

### 4️⃣ Build the Project

```bash
mvn clean package

```
### 5️⃣ Run the Application
You can run the app using Maven:

```bash
mvn javafx:run
```

Or manually using the JAR file generated in the target/ folder:

```bash
java -jar target/Weather_Application-1.0-SNAPSHOT.jar

```

### 🖼️ Screenshots
<img width="1492" height="910" alt="Image" src="https://github.com/user-attachments/assets/6b7d7873-cca2-4e00-830f-0b9c82e690a9" />

### 📚 How It Works
1. User enters a city name in the text field.

2. The app sends an HTTP GET request to the OpenWeatherMap REST API.

3. JSON response is parsed using the org.json library.

4. The extracted weather details (temperature, humidity, description) are displayed in the GUI.

💡 Example API Call

```bash
https://api.openweathermap.org/data/2.5/weather?q=London&appid=YOUR_API_KEY&units=metric

```

## Sample JSON Response:

```bash 
{
  "name": "London",
  "main": {
    "temp": 15.5,
    "humidity": 72
  },
  "weather": [
    { "description": "light rain" }
  ]
}

```

## 🧠 Learning Objectives

This project helps you understand:

 -> How to consume REST APIs using Java

 -> Working with JSON data in Java

 -> Building interactive desktop GUIs using JavaFX

 -> Using Maven for dependency management and project builds

### 🏁 Output Example
```bash
City: Chennai
Temperature: 32.6 °C
Humidity: 60%
Description: clear sky

```
🤝 Creator

P Sriram — Developer

🌐 API Reference

#### OpenWeatherMap API Docs
