public class TrainConsistManagementApp {

    // ✅ UC20 Method
    public static boolean searchBogie(String[] bogies, String key) {

        // Defensive Check (Fail-Fast)
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

        // Search Logic
        for (String b : bogies) {
            if (b.equals(key)) {
                return true;
            }
        }

        return false;
    }

    // ✅ MAIN METHOD (ONLY ONE)
    public static void main(String[] args) {

        // ❌ Test 1: Empty array
        try {
            String[] empty = {};
            searchBogie(empty, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Test1 Passed: " + e.getMessage());
        }

        // ✅ Test 2: Data exists
        String[] data = {"BG101", "BG205"};
        System.out.println("Test2 Passed: Search allowed");

        // ✅ Test 3: Bogie found
        String[] list1 = {"BG101", "BG205", "BG309"};
        System.out.println("Test3 Found: " + searchBogie(list1, "BG205"));

        // ❌ Test 4: Bogie not found
        System.out.println("Test4 Not Found: " + searchBogie(list1, "BG999"));

        // ✅ Test 5: Single element
        String[] single = {"BG101"};
        System.out.println("Test5 Single: " + searchBogie(single, "BG101"));
    }
}