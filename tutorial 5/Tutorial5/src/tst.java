public class tst {
    enum WeatherCondition {
        SUNNY, RAINY, CLOUDY
    }

    public static void main(String[] args) {
        WeatherCondition currentWeather = WeatherCondition.RAINY;

        String activity = (currentWeather == WeatherCondition.SUNNY) ? "Go for a picnic." :
                (currentWeather == WeatherCondition.RAINY) ? "Stay indoors and read a book." :
                        "Take a relaxing walk."; // Default for CLOUDY

        System.out.println("The weather is " + currentWeather + ". " + activity);
    }
}
