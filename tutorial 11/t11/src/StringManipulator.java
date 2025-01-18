public class StringManipulator {
    String reverse(String s){
        String r="";
        char ch;
        for(int i=0;i<s.length();i++) {
            ch = s.charAt(i);
            r = ch + r;
        }
        return r;
    }

    String reverse(String s, int n){
        String r="";
        char ch;
        for(int i=0;i<n;i++) {
            ch = s.charAt(i);
            r = ch + r;
        }
        return r;
    }
    String reverse(String s,int start,int end){
        String r="";
        char ch;
        for(int i=start-1;i<=end-1;i++) {
            ch = s.charAt(i);
            r = ch + r;
        }
        return r;
    }

    public static void main(String[] args) {
        StringManipulator S1 = new StringManipulator();
        System.out.println(S1.reverse("12345678"));
        System.out.println(S1.reverse("12345678",4));
        System.out.println(S1.reverse("12345678",2,5));
    }

}
