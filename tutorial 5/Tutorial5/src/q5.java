public class q5 {
    public static void main(String[] args) {
        String original ="software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');
        result.setCharAt(0, original.charAt(0));
        result.insert(1, original.charAt(4));
        result.append(original.substring(1, 4));
        result.insert(3, (original.substring(index, index+2) + ""));
        System.out.println(result);


    }
}