class SearchContact {
    // Arrays storing data
    static String[] emails = {
        "ram@gmail.com", "kumar@gmail.com", "adhu@gmail.com", "kanth@gmail.com", "amruth@gmail.com",
        "laad@gmail.com", "nikki@gmail.com", "sunil@gmail.com", "khan@gmail.com", "thair@gmail.com",
        "mahi@gmail.com", "mahesh@gmail.com", "darshan@gmail.com", "harsha@gmail.com", "kunal@gmail.com"
    };
    
    static long[] mobileNumbers = {
        9895455, 345546, 4534462, 4463632, 6547442,
        4643432, 4344632, 9453432, 6563442, 4534632,
        4534462, 4653446, 6544632, 5465362, 4655344
    };
    
    static String[] names = {
        "ramkumar", "kumar", "adarsh", "pruthvi", "nikethan",
        "nikihil", "sunil", "khan", "thair", "mahi",
        "mahesh", "darshan", "harsha", "kunal"
    };

    static String[] nameEmails = {
        "ram@gmail.com", "kumar@gmail.com", "adhu@gmail.com", "kanth@gmail.com", "laad@gmail.com",
        "nikki@gmail.com", "sunil@gmail.com", "khan@gmail.com", "thair@gmail.com", "mahi@gmail.com",
        "mahesh@gmail.com", "darshan@gmail.com", "harsha@gmail.com", "kunal@gmail.com"
    };

    // Method to get mobile number by email
    static long getMobileByEmail(String email) {
        for (int i = 0; i < emails.length; i++) {
            if (emails[i].equals(email)) {
                return mobileNumbers[i];
            }
        }
        System.out.println("Email not found.");
        return 0;
    }

    // Method to get email by name
    static String getEmailByName(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return nameEmails[i];
            }
        }
        System.out.println("Name not found.");
        return null;
    }

    // Method to search contacts by last name
    static String[] searchByLastName(String lastName) {
        String[] contacts = {
            "Rahul Kapoor", "Amit Kapoor", "Vikas Kapoor", "Neha Kapoor", "Raj Kapoor",
            "Vivek Sharma", "Priya Sharma", "Rohan Sharma", "Anjali Sharma", "Deepak Sharma",
            "Ravi Shetty", "Kiran Shetty", "Manoj Shetty", "Sunita Shetty", "Arjun Shetty"
        };

        // Count matching names
        int count = 0;
        for (String contact : contacts) {
            if (contact.endsWith(lastName)) {
                count++;
            }
        }

        // Store matching names in an array
        String[] result = new String[count];
        int index = 0;
        for (String contact : contacts) {
            if (contact.endsWith(lastName)) {
                result[index++] = contact;
            }
        }
        return result;
    }
}
