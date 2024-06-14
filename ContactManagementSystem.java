import java.util.ArrayList;
import java.util.Scanner;

public class ContactManagementSystem {
    private static ArrayList<Contact> contacts = new ArrayList<>(); 
    //Making an object of class Contact, in form of an ArrayList

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSimple Contact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    updateContact(scanner);
                    break;
                case 4:
                    deleteContact(scanner);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addContact(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(name, phoneNumber, email);
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contacts:");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
    }

    private static void updateContact(Scanner scanner) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        System.out.print("Enter the serial number of the contact to update: ");
        int index = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (index <= 0 || index > contacts.size()) {
            System.out.println("Invalid serial number.");
            return;
        }

        Contact contact = contacts.get(index - 1); //Because index starts from 0; (if you ask for sn.1 ie. index 0)
        System.out.print("Enter new name (press enter for no change): ");
        String name = scanner.nextLine();
        System.out.print("Enter new phone number (press enter for no change): ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter new email (press enter for no change): ");
        String email = scanner.nextLine();

        if (!name.isEmpty()) contact.setName(name); //If no change is made in any field
        if (!phoneNumber.isEmpty()) contact.setPhoneNumber(phoneNumber);
        if (!email.isEmpty()) contact.setEmail(email);

        System.out.println("Contact updated successfully.");
    }

    private static void deleteContact(Scanner scanner) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        System.out.print("Enter the number of the contact to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (index <= 0 || index > contacts.size()) {
            System.out.println("Invalid contact number.");
            return;
        }

        contacts.remove(index - 1);
        System.out.println("Contact deleted successfully.");
    }
}
