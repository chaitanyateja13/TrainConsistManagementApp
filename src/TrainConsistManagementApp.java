public static void bubbleSort(int[] capacities) {
    int n = capacities.length;

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (capacities[j] > capacities[j + 1]) {
                int temp = capacities[j];
                capacities[j] = capacities[j + 1];
                capacities[j + 1] = temp;
            }
        }
    }

    System.out.println("Sorted Capacities:");
    for (int c : capacities) {
        System.out.print(c + " ");
    }
}

void main() {
    int[] capacities = {50, 30, 70, 20};
    bubbleSort(capacities);
}