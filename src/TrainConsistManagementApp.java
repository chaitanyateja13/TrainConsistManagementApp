public static void linearSearch(String[] ids, String key) {
    boolean found = false;

    for (String id : ids) {
        if (id.equals(key)) {
            found = true;
            break;
        }
    }

    if (found)
        System.out.println("Bogie found: " + key);
    else
        System.out.println("Bogie not found");
}

void main() {
    String[] ids = {"B1", "B2", "B3", "B4"};
    linearSearch(ids, "B3");
}