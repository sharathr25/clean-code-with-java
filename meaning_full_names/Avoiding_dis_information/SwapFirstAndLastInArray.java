class SwapFirstAndLastInArray {
    public static void printArrayWithTitle(int[] array, String title) {
        System.out.println(title);
        for(int i = 0; i< array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void goodCode() {
        int[] numbers = {1,2,3,4};
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        printArrayWithTitle(numbers,"Before swap");
        numbers[0] = lastElement;
        numbers[numbers.length - 1] = firstElement;
        printArrayWithTitle(numbers,"After swap");
    }

    public static void badCode() {
        int[] numbersList = {1,2,3,4}; // Dis inforamtion, because we are declaring an array but the name is 'numbersList'
        int fe = numbersList[0]; // fe looks like a good abbreviation for firstElement,but it could be disinformative
        int le = numbersList[numbersList.length - 1]; // same as above
        printArrayWithTitle(numbersList, "Before swap");
        numbersList[0] = le;
        numbersList[numbersList.length - 1] = fe;
        printArrayWithTitle(numbersList, "After swap");
    }

    public static void main(String[] args) {
        System.out.println("******** output with bad code *********");
        badCode();
        System.out.println("******** output with good code ********");
        goodCode();
    }
}
