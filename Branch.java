public class Branch {
    static String[] branchNames = {null, null, null};
    static int index = 0;

    public static void addBranch(String branchName) {
        if (branchNames != null) {
            if (index < branchNames.length) {
                branchNames[index] = branchName; // Corrected assignment
                System.out.println("Branch name is saved successfully");
                index++; // Increment index
            } else {
                System.out.println("Array is full, cannot add more branches");
            }
        }
    }

    public static void main(String[] args) {
        addBranch("CSE");
        addBranch("ECE");
        addBranch("MECH");
        addBranch("CIVIL"); // This will print "Array is full"
    }
}
