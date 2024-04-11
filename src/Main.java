public class Main {
    public static void main(String[] args) {

        int a = 10;


        Zdajacy zdajacy = new Zdajacy() {
            @Override
            public void uczSie() {
                System.out.printf("Ucze sie! %d",a);
            }

            @Override
            public void mysl(){
                System.out.println("Cogito ergo sum");
            }

        };
        zdajacy.uczSie();
        zdajacy.mysl();
    }
}