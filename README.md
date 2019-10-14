# CarDealership
This is a car dealership project made for my university project as part of my course.

This project is about implementing OOP concepts into a Car Dealership where a


<h2> Functionality </h2> 

Three types of roles need to be created: "Admin Role", "Staff Role" and "Customer
Role". Once the users successfully log into the system, they should be able to access the below
functionalities according their roles.

<b> Admin Role </b>
<ul>
<li> Creates login credentials for staff and customers as below: <li>
  <ul>
    <li> Creates username, password and sets their role. </li>
    <li> Passwords should not be stored as they are. Any algorithm for encoding is accepted, and it does not matter how complex it is. </ul> </li>
<li> Has all functionality that the staff role has. </ul> </br> </br>

<b> Staff Role </b>
<ul>
<li> Login: if the entered credential is correct, allows user to use the available functionality. </li>
<li> Add cars: allows to add a list of cars provided in a file; each line in the file describes one
car by the following attributes, separated by commas: number plate, model, car type, size
(only available and applicable for vans), colour, mileage, accident history, transmission type,
price, arrival date, selling date. The selling date is optional; if it is left out, then the car is not
yet sold. If the arrival date is also left out, then the current date is used as the arrival date.
  (An example file is given in Appendix B.) </li>
<li> Add car: allows to add a single car with the parameters number plate, model, car type, size
(only available and applicable for vans), colour, mileage, accident history, transmission type,
price, arrival date, selling date. Again if the selling date is left out, then the car is not yet sold.
If the arrival date is also left out, then the current date is used as the arrival date.
  </li>
  <li> Sell car: changes the status of a car to sold by saving the date the car was sold. </li>
<li> Print cars: outputs a file of all cars grouped into sold and unsold and sorts the former by
the selling date and the latter by the day of their arrival. The format is the same as the input
  format with the exception that every car must have an arrival date. </li>
<li> Search: for each of the following options, outputs a list of all available cars (all car details
  must be included) </li>
  <ul>
    <li> that have the given model and transmission type or have the given colour, </li>
    <li> whose number of seats is between a user-specified minimum and maximum, which are Vans with a user-specified size
  </ul> </li>
<li> Calculate revenue ... calculates and outputs the revenue of the specified day or month, that
  is the sum of the selling prices of the cars sold on that day or in that month. </li> </ul> </br> </br>

<b> Customer Role </b>
<ul>
<li> can do the same search as staff users, but not having access to accident history information.
</ul>

<h2> Documentation and Submission </h2> 
This project covers 
<ul> 
<li> a documentation, </li>
<li> all source files (i.e. java files) as well as all other files needed to compile and run the program (e.g.
libraries), </li>
<li> a jar file cardealer.jar that is executed by the command java -jar cardealer.jar, </li>
<li> a text file cars-output.txt to store the output of the "Print cars" function (one car per line, see
the "Print cars" function), </li>
<li> a text file cars-import.txt to import a list of cars (see the "Add cars" function), and </li>
<li> a text file cars-users.txt to store the login credentials (username, password and role). The passwords must be encrypted (see the Functionality section). The following credentials(username,
password, role) should be applied to your system: </li>
  <ul>
    <li> admin1, apple, admin </li> 
    <li> staff1, orange, staff </li> 
    <li> customer1, lemon, customer  </ul> </li> 
</ul> 
  
