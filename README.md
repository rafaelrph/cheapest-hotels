# cheapest-hotels

This is a Spring Boot project (v 1.5.16) that consumes an external API and returns the top 3 cheapest hotels which are closed to airports.

# Requirements

* JDK
* Apache Maven - https://maven.apache.org/download.cgi
* Spring Boot Cli - https://repo.spring.io/release/org/springframework/boot/spring-boot-cli/

# Launching

1. Clone the repository
2. Go to the project's folder on the command line
3. Launch command: mvn spring-boot:run

Project will be launched: http://localhost:8080/api/hotels/cheapest

Example: http://localhost:8080/api/hotels/cheapest?check_in=2018-12-15&check_out=2018-12-16&location=YVR

# Deployed - Heroku

https://aw-cheapest-hotels-api.herokuapp.com/

https://aw-cheapest-hotels-api.herokuapp.com/api/hotels/cheapest?check_in=2018-12-15&check_out=2018-12-16&location=YVR

# External API

Consumes: https://sandbox.amadeus.com/travel-innovation-sandbox/apis/get/hotels/search-airport
