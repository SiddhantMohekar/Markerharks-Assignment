# Markerharks-Assignment
Project Overview 
 The Makershark Supplier Search API lets you look for suppliers using specific factors like where they're located, what kind of business they do, and how they make things. This API can handle big sets of results by showing them in pages. It also checks and cleans up what you put in to keep data safe.

# Technologies Used
1.Java 17: Programming language
2.Spring Boot: Application framework
3.Spring Data JPA: Database interaction
4.MySQL: Database
5.Maven: Build tool

# Prerequisites
Before running the application, ensure you have the following installed:
1.Java 17 or higher
2.Maven: Version 3.6.0 or higher
3.MySQL: Running MySQL server

# Installation Instructions
1. Clone the Repository
code:
git clone https://github.com/your-username/your-repository-name.git
cd your-repository-name
2. Configure the Database
Update the application.properties file with your MySQL credentials:

properties
code:
spring.datasource.url=jdbc:mysql://localhost:3306/markshreet_db
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update

3. Build the Project
Use Maven to build the project:
code:
mvn clean install
4. Run the Application
Start the Spring Boot application:

code:
mvn spring-boot:run
The application should now be running at http://localhost:8080.

# API Endpoints
Endpoint: /query
Method: POST
Description: Fetch a list of suppliers based on location, nature of business, and manufacturing processes. Supports pagination.

Request Body:
{
  "location": "India",
  "natureOfBusiness": "small_scale",
  "manufacturingProcesses": "3d_printing"
}

Response:
[
    {
        "supplier_id": 1,
        "company_name": "ABC",
        "website": "http://abcmanufacturing.com",
        "location": "India",
        "natureOfBusiness": "small_scale",
        "manufacturingProcesses": "3d_printing"
    },
    {
        "supplier_id": 2,
        "company_name": "XYZ Industries",
        "website": "http://xyzmanufacturing.com",
        "location": "India",
        "natureOfBusiness": "small_scale",
        "manufacturingProcesses": "3d_printing"
    },
    {
        "supplier_id": 3,
        "company_name": "ABC Manufacturing",
        "website": "http://abcmanufacturing.com",
        "location": "India",
        "natureOfBusiness": "small_scale",
        "manufacturingProcesses": "3d_printing"
    },
    {
        "supplier_id": 4,
        "company_name": "Ravish Manufacturing",
        "website": "http://ravishmanufacturing.com",
        "location": "India",
        "natureOfBusiness": "small_scale",
        "manufacturingProcesses": "3d_printing"
    },
    {
        "supplier_id": 5,
        "company_name": "3DTech Solutions",
        "website": "www.3dtechsolutions.com",
        "location": "India",
        "natureOfBusiness": "small_scale",
        "manufacturingProcesses": "3d_printing, moulding"
    }
]

2. Pagination Parameters
Parameters:
page: Page number (starting from 0)
size: Number of records per page

3. Example CURL Command
code:
curl -X POST http://localhost:8080/query \
-H "Content-Type: application/json" \
-d '{
      "location": "India",
      "natureOfBusiness": "small_scale",
      "manufacturingProcesses": "3d_printing"
    }'
