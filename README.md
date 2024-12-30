# AIWithJava

## Overview
**AIWithJava** is a multi-functional AI-powered application built using Java and Spring Boot for the backend, OpenAI APIs for AI functionality, and React for the frontend. The project comprises three separate applications that leverage artificial intelligence to provide engaging and practical features:

1. **Image Generator**: Generate AI-based images based on user prompts.
2. **Recipe Generator**: Create personalized recipes using AI based on user inputs or selected ingredients.
3. **Chat Bot**: Engage in conversational AI interactions for general queries and assistance.

---

## Tech Stack

- **Backend**: Java, Spring Boot, OpenAI API
- **Frontend**: React
- **Others**: REST APIs, JSON, HTML, CSS

---

## Features

### 1. Image Generator
- Accepts user prompts to create unique AI-generated images.
- Uses the OpenAI image generation API.
- Displays generated images in a responsive grid layout.

### 2. Recipe Generator
- Generates custom recipes based on ingredients or user descriptions.
- Offers multiple recipe suggestions for input queries.
- User-friendly UI for entering and viewing recipes.

### 3. Chat Bot
- Conversational AI that answers user queries and provides assistance.
- Leverages OpenAI's language models for intelligent responses.
- Capable of handling general questions and providing specific solutions.

---

## Installation and Setup

### Prerequisites
- Java 23 or later
- Node.js and npm
- Spring Boot
- OpenAI API key

### Backend Setup
1. Clone the repository:
   ```bash
   git https://github.com/sudhamshreddy7/AIWithJava.git
   cd AIWithJava/src
   ```
2. Configure the OpenAI API key:
    - Open `application.properties`.
    - Add your OpenAI API key:
      ```properties
      openai.api.key=your_openai_api_key
      ```
3. Build and run the backend:
   ```bash
   ./mvnw spring-boot:run
   ```
   The backend server will run on `http://localhost:8080`.

### Frontend Setup
1. Navigate to the frontend directory:
   ```bash
   cd AIWithJava/front-end
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the React development server:
   ```bash
   npm start
   ```
   The frontend will run on `http://localhost:3000`.

---

## How to Use

### Image Generator
1. Navigate to the "Image Generator" tab on the UI.
2. Enter a descriptive prompt in the input field.
3. Click "Generate Image" to view AI-generated images.

### Recipe Generator
1. Go to the "Recipe Generator" tab.
2. Enter ingredients or a description of the desired recipe.
3. Click "Generate Recipe" to view the AI-created recipes.

### Chat Bot
1. Access the "Chat Bot" tab.
2. Enter your query in the chat box.
3. Receive responses from the AI-powered chatbot in real time.

---

## Project Structure
```
AIWithJava/
|
|───~           # Backend application (Spring Boot)
│   ├── src/main/java/   # Java source code
│   ├── resources/       # Configuration files (e.g., application.properties)
│   └── pom.xml          # Maven dependencies
|
├── front-end/            # Frontend application (React)
│   ├── src/             # React components and pages
│   ├── public/          # Static assets
│   └── package.json     # npm dependencies
|
└── README.md            # Project documentation
```

---

## API Endpoints

### Backend (Spring Boot)
- **Image Generator**: `GET /generate-image?message={prompt}`
- **Recipe Generator**: `GET /recipe?items={ingridents}&cuisine={cuisine type}&restrictions={dietery restrictions}`
- **Chat Bot**: `POST /QueryAI?message={promot}`

---

## Contributing
Contributions are welcome! Follow these steps to contribute:
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-name
   ```
3. Make your changes and commit them:
   ```bash
   git commit -m "Add feature-name"
   ```
4. Push to the branch:
   ```bash
   git push origin feature-name
   ```
5. Open a pull request.

---


## Acknowledgements
- [OpenAI](https://openai.com) for providing the APIs.
- [Spring Boot](https://spring.io/projects/spring-boot) for the backend framework.
- [React](https://reactjs.org/) for the frontend framework.

---

## Contact
For any inquiries or issues, please contact:
- **Name**: Sudhamsh
- **Email**: sudhamshreddy06@gmail.com