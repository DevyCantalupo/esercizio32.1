public class esercizio32di1 {
    public static void main(String[] args) {
        String nombre = "Franco";
        System.out.println(stringLength(nombre));
    }
    public static Integer stringLength(String x) {
        if (x == null){
            return null;
        }
        return x.length();
    }
}
