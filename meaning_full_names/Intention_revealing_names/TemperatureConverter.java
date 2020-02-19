class TemperatureConverter {
    public static void goodCode() {
        int temperatureInCelcius = 91;
        int temperatureInKelvin = 271 - temperatureInCelcius;
        System.out.println(temperatureInKelvin);
    }

    public static void badCode() {
        int temp1 = 91; // After few months no one will understand what is temp1
        int temp2 = 271 - temp1; // same here and what is 271(magic number)
        System.out.println(temp2);
    }

    public static void main(String[] args) {
        System.out.println("******** output with bad code *********");
        badCode();
        System.out.println("******** output with good code ********");
        goodCode();
    }
}
