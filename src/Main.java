//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Jethro";
        System.out.println("Hello, " + name);
//        String intro = "Hello World";
//        String add = "!";
//        int age = 12;
//        double height = 6.1;
//        String firstchar = intro.charAt();
//        System.out.println(firstchar);
//        int calc = Math.min(12,13);
//        System.out.println(calc);

        //
//        int[] age = {12, 12, 13, 13, 14, 14, 15, 15, 16, 17, 18, 19, 20, 20, 22, 22, 25};
//        int[] duplicate = new int[age.length];
//        for (int i = 0; i < age.length; i++) {
//            if (age[i] == age[i+1]) {
//                i++;
//            }
//        }
//        int num = 0;
//        for(int a = 20; a >= 0; a--) {
//            System.out.println(a);
//        }

//       for(int i = 0; i <= 20; i++){
//           System.out.println(i);
//       }
        // string and typecasting
        // Widening typecasting.
//        int num = 12;
//        double num1 = num;
//        System.out.println(num);
//        System.out.println(num1);

        // narrowing typecasting
//        double mynum = 12;
//        int mynum1 = (int)mynum;
//        System.out.println(mynum);
//        System.out.println(mynum1);


        Test ts = new Test();
        System.out.println(ts.subtract(12, 5));
        System.out.println(ts.subtract(30,20,10));
        System.out.println(ts.subtract(20.5, 10.2));




    }

}