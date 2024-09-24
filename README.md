

---

# Shape Detectaah

*Shape Detector* is an Android application built with Kotlin and Jetpack Compose for the frontend. It utilizes OpenCV for real-time object detection, specifically for detecting and recognizing various shapes. The project demonstrates the power of combining native Android development tools with computer vision technologies.

## Features
- Real-time object and shape detection using OpenCV
- Intuitive UI built with Jetpack Compose
- Fast and accurate detection of circles, squares, and other geometric shapes
- Lightweight and easy-to-use interface

## Architecture
This project follows a modular architecture with the following components:
- *UI Layer (Jetpack Compose):* Handles the display and user interaction with the app.
- *OpenCV Integration:* Handles all object detection and image processing tasks.
- *ViewModel:* Acts as a bridge between the UI layer and the detection logic, maintaining state and data throughout the app's lifecycle.

### Technologies Used
- *Kotlin*: For developing the Android application.
- *Jetpack Compose*: For building the UI with a declarative approach.
- *OpenCV*: For object detection and image processing.
- *ViewModel*: Part of Android Jetpack, used for managing UI-related data.

## Installation

### Prerequisites
- Android Studio Flamingo or later
- Android device or emulator running Android 7.0 (Nougat) or higher
- OpenCV SDK

### Setup
1. *Clone the repository*
   bash
   git clone https://github.com/rahul028/lascade_shape-detection.git
   

2. *Open the project in Android Studio*
   - Open Android Studio and select the project from the cloned repository.

3. *Configure OpenCV*
   - Download the OpenCV SDK from [OpenCV's official website](https://opencv.org/releases/).
   - Add the OpenCV SDK to your project by copying the library files to the appropriate location in your Android project.

4. *Build and run the project*
   - Make sure you have an Android device connected or an emulator running.
   - Click "Run" in Android Studio to build and install the app on your device.

## How It Works
1. When the app launches, the camera feed is used to detect shapes in real-time.
2. OpenCV processes the video stream and identifies geometric shapes like circles, squares, etc.
3. Detected shapes are highlighted and can be interacted with through the app interface.

## Future Enhancements
- Add AR Feature-set to project the shape into 3D space and interact with it.
- Add Apple Vision Pro Support.
- Improve detection accuracy for complex shapes
- Add support for more shape types (e.g., triangles, polygons)
- Integrate additional features such as color detection and edge detection

## Made with Love by : @rahul028 [Rahul R]
