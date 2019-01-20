# Expense-Tracker
SpringBoot Web Application 


## Use a PostgreSQL database in a Spring Boot Web Application through Hibernate


### Usage

- Run the application and go on http://localhost:8081/
- Use the following urls to invoke controllers methods and see the interactions with the database:-
  
  * URL: /api/user
	Method Type:Post
	Input Request:
{
	"userBean":
	{
		"firstName":"San",
		"lastName":"G",
		"gender":"Male",
		"primaryEmailId":"san@gmail.com",
		"secretKey":"san123"
	}
}
	Description:
				Creates a new user with an auto-generated id and primary email and name as passed values.
        Note:secretKey(ie. Password) will be stored in encrypted format.	
 
				

### Build and run

#### Configurations

Open the `application.properties` file and set your own configurations for the
database connection.

#### Prerequisites

- Java 7


#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.
