# CinemaParadiso

Welcome to **CinemaParadiso**, the ultimate community-driven platform for movie enthusiasts! Here, users can discover, discuss, and review their favorite films.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [Contact](#contact)

## Features

- **Movie Database**: Explore a vast collection of movies with detailed information.
- **User Reviews**: Write and read reviews from other movie lovers.
- **Discussion Forums**: Participate in discussions about movies, genres, and actors.
- **Personalized Recommendations**: Get movie recommendations based on your preferences.
- **Rating System**: Rate movies and see how they rank in the community.

## Installation

To get a local copy up and running, follow these simple steps:

### Prerequisites

- 
- Jsoup
- MySQL (for database)

### Steps

1. Clone the repository:
    ```sh
    git clone https://github.com/dannyk20/cinemaparadiso.git
    ```
2. Navigate to the project directory:
    ```sh
    cd cinemaparadiso
    ```
3. Install NPM packages:
    ```sh
    npm install
    ```
4. Set up environment variables:
    - Ensure MySQL is installed and running.
    - Run the SQL script provided in `query.txt` to set up the database schema and initial data:
      ```sh
      mysql -u yourusername -p yourpassword yourdatabase < query.txt
      ```
5. Start the development server:
    ```sh
    npm start
    ```

## Usage

Once the server is running, you can access the website at `http://localhost:your_preferred_port`. 

### Key Pages

- **Home**: Browse recent and popular movies.
- **Reviews**: View detailed information about a specific movie, including reviews and ratings.
- **Forums**: Join discussions or start your own thread about any movie-related topic.

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Contact

dannyk20 - [dannyk20@naver.com](mailto:dannyk20@naver.com)

Project Link: [https://github.com/dannyk20/cinemaparadiso](https://github.com/dannyk20/cinemaparadiso)
