# CarDealership
This is a car dealership project made for my university project as part of my course.

This project is about implementing OOP concepts into a Car Dealership where a


<h2> Functionality </h2> 

Three types of roles need to be created: "Admin Role", "Staff Role" and "Customer
Role". Once the users successfully log into the system, they should be able to access the below
functionalities according their roles.
Admin Role
– Creates login credentials for staff and customers as below:
<li> Creates username, password and sets their role. </li>
<li> Passwords should not be stored as they are. Any algorithm for encoding is accepted,
and it does not matter how complex it is. </li>
– Has all functionality that the staff role has.
• Staff Role
– Login ... if the entered credential is correct, allows user to use the available functionality.
– Add cars ... allows to add a list of cars provided in a file; each line in the file describes one
car by the following attributes, separated by commas: number plate, model, car type, size
(only available and applicable for vans), colour, mileage, accident history, transmission type,
price, arrival date, selling date. The selling date is optional; if it is left out, then the car is not
yet sold. If the arrival date is also left out, then the current date is used as the arrival date.
(An example file is given in Appendix B.)
– Add car ... allows to add a single car with the parameters number plate, model, car type, size
(only available and applicable for vans), colour, mileage, accident history, transmission type,
price, arrival date, selling date. Again if the selling date is left out, then the car is not yet sold.
If the arrival date is also left out, then the current date is used as the arrival date.
1
– Sell car ... changes the status of a car to sold by saving the date the car was sold.
– Print cars ... outputs a file of all cars grouped into sold and unsold and sorts the former by
the selling date and the latter by the day of their arrival. The format is the same as the input
format with the exception that every car must have an arrival date.
– Search ... for each of the following options, outputs a list of all available cars (all car details
must be included)
∗ that have the given model and transmission type or have the given colour,
∗ whose number of seats is between a user-specified minimum and maximum,
∗ which are Vans with a user-specified size.
– Calculate revenue ... calculates and outputs the revenue of the specified day or month, that
is the sum of the selling prices of the cars sold on that day or in that month.
• Customer Role
– can do the same search as staff users, but not having access to accident history information.
