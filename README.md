# Bus-Management-System

⚙️ Installation & Setup
1️⃣ Clone the Repository
git clone https://github.com/your-username/bus-booking-system.git
cd bus-booking-system

2️⃣ Configure Database (MySQL)

Create a database in MySQL:

CREATE DATABASE bus_booking;

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/bus_booking
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Run the Application
mvn spring-boot:run

The app will start on:
👉 http://localhost:8080

📡 API Endpoints (Sample)
Method	Endpoint	Description
POST	/api/auth/signup	Register new user
POST	/api/auth/login	Authenticate user & JWT
GET	/api/buses	Get all buses
POST	/api/bookings	Create new booking
DELETE	/api/bookings/{id}	Cancel booking
GET	/api/reviews/{busId}	Get bus reviews
