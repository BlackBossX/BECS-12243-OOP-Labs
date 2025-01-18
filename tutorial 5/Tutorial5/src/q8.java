public class q8 {
    public static void main(String[] args) {

        final String weather1 = "SUNNY";
        final String weather2 = "RAINY";
        final String weather3 = "CLOUDY";

        String weatherInput ="SUNNY";

        String out = (weatherInput==weather1)?  "Go for a picnic.":(weatherInput==weather2)? "Stay indoors and read a book.":"Take a relaxing walk.";
        System.out.println(out);

    }
}
