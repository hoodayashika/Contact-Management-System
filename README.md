# Contact-Management-System
Basic CRUD operations and user input/output, use of ArrayList data structures to create a command line contact management system

This repository contains a Simple Contact Management System written in Java, which allows users to manage their contacts through a console-based interface. The system is built using two core components: a Contact class that represents individual contacts, and a ContactManagementSystem class that provides functionality to add, view, update, and delete contacts.

## Features
- Add Contact: Users can add a new contact by providing a name, phone number, and email.
- View Contacts: Lists all stored contacts with their details (name, phone number, email).
- Update Contact: Allows modifying the information of an existing contact.
- Delete Contact: Deletes a contact by selecting its serial number.
- Exit: Closes the application.
  
## Components
### 1. Contact.java
This class represents a contact entity and encapsulates the following:
- Fields:
- 1. name: The contact's name.
  2. phoneNumber: The contact's phone number.
  3. email: The contact's email address.
- Constructor: Initializes a contact object with a name, phone number, and email.
- Getters and Setters: Accessor and mutator methods for the contact's fields.
toString() Method: Provides a human-readable format for displaying contact information.

### 2. ContactManagementSystem.java
- This is the main driver class for managing contacts. It utilizes an ArrayList<Contact> to store and manipulate contact information. The program provides a user-friendly menu for performing the following operations:
- 1. Add a Contact: Users can input a contact's details to store them.
  2. View Contacts: Displays all contacts in a list format.
  3. Update a Contact: Updates the selected contact's information.
  4. Delete a Contact: Removes a contact from the list by its serial number.
  
The system ensures smooth handling of invalid inputs with basic error checks and offers a persistent loop until the user chooses to exit.
