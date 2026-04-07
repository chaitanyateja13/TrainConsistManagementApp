public static void binarySearch(String[] ids, String key) {
    int low = 0;
    int high = ids.length - 1;
    boolean found = false;

    while (low <= high) {
        int mid = (low + high) / 2;

        int result = key.compareTo(ids[mid]);

        if (result == 0) {
            found = true;
            break;
        } else if (result > 0) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    if (found)
        System.out.println("Bogie found: " + key);
    else
        System.out.println("Bogie not found");
}

void main() {
    String[] sortedIds = {"B1", "B2", "B3", "B4"};
    binarySearch(sortedIds, "B2");
}