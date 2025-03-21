class SearchContactRunner {
    public static void main(String[] args) {
        // Test getMobileByEmail
        System.out.println("Mobile of 'arjun@example.com': " + SearchContact.getMobileByEmail("arjun@example.com"));

        // Test getEmailByName
        System.out.println("Email of 'Mohan': " + SearchContact.getEmailByName("Mohan"));

        // Test searchByLastName
        System.out.println("\nContacts with last name 'Kapoor':");
        for (String contact : SearchContact.searchByLastName("Kapoor")) {
            System.out.println(contact);
        }

        System.out.println("\nContacts with last name 'Sharma':");
        for (String contact : SearchContact.searchByLastName("Sharma")) {
            System.out.println(contact);
        }

        System.out.println("\nContacts with last name 'Shetty':");
        for (String contact : SearchContact.searchByLastName("Shetty")) {
            System.out.println(contact);
        }
    }
}
