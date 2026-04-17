# EDP-VehiclTripRequestSystem

**Project Description**

EduTrip is a Vehicle Trip Request System designed for institutions to manage transportation requests and reservations efficiently. The system provides a centralized platform where passengers can request trips, drivers can view assigned schedules, and administrators can manage users and system operations.

The purpose of EduTrip is to replace manual and paper-based trip requests with a digital solution that improves organization, tracking, and communication. It ensures that trip scheduling becomes faster, more accurate, and easier to manage.


**Features**

The system includes several core features that make it functional and user-friendly:


**Login UI**

•Users can securely log in using their credentials.

•Role-based access determines whether the user is an Admin, Passenger, or Driver.


**Admin UI (Administrator Role)**

•Add new users (Passenger or Driver).

•Update user profiles

•Activate or deactivate users

•Monitor and manage trip requests


**Passenger UI (Passenger Role)**

•Request or reserve vehicle trips

•View request status

•Update personal profile


**Driver UI (Driver Role)**

•View assigned trips

•Manage schedules

•Update profile information


**User Profile Management**

•All users can edit and update their personal information


**Technologies Used**

The system was developed using the following technologies:

**•JavaFX** – Used for building the graphical user interface (UI)

**•Java** – Used as the main programming language for backend logic

**•Microsoft SQL Server (MSSQL)** – Used as the database to store system data

**•JDBC (Java Database Connectivity)** – Used to connect the Java application to MSSQL and execute database queries

**•Eclipse IDE** – Used as the development environment


**Setup Installation Guide**

Steps to Install the System:

*1. Install Required Software*

•Java JDK (8 or higher)

•Eclipse IDE

•Microsoft SQL Server (MSSQL)

•SQL Server Management Studio (SSMS)

•JavaFX SDK


**2. Set Up the Database**

•Open SSMS

•Create a new database (e.g., EduTripDB)

•Import the provided .sql file


**3. Add JDBC Driver**

•Download the Microsoft SQL Server JDBC Driver

•Right-click project → Properties

•Go to Java Build Path → Libraries

•Click Add External JARs

•Select the downloaded JDBC .jar file


**4. Configure Database Connection**

•Open the connection class (e.g., DbConnectMsSql.java)

•Update the database credentials:

  String url = "jdbc:sqlserver://localhost:1433;databaseName=EduTripDB";

  String user = "your_username";

  String password = "your_password";


**5. Add JavaFX Library**

•Right-click project → Properties

•Go to Java Build Path → Libraries

•Add JavaFX SDK (lib folder)


**6. Configure VM Options**

•Open Run Configurations

•Add: --module-path "path_to_javafx_lib" --add-modules javafx.controls,javafx.fxml


**7. Run the Project**

•The EduTrip system should now run

