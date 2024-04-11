public class Main {
    public static void main(String[] args) {


        Zdajacy zdajacy = new Zdajacy() {
            @Override
            public void uczSie() {
                System.out.println("Ucze sie!");
            }
        };
        zdajacy.uczSie();
    }
}