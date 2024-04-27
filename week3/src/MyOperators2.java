public class MyOperators2 {

    public static void main(String[]args){

//         Boolean operators;
//
//        Boolean tuna = true;
//         Boolean bread = true;
//         if (tuna == tuna && bread == true) {
//             System.out.println("We are having a sandwich!");
//         } else {
//             System.out.println("We are not!");
//         }

         Boolean tuna = false;
         Boolean bread = false;
         if(tuna == true || bread == tuna) {
             System.out.println("We are having some food products");
         } else {
             System.out.println("We will not be eating any food products today!");
         }

         // age - drinking age !

        int age = 18;

        if(age >= 18) {
            System.out.println("Vippy skippy,we can order an adult beverage!");
        } else {
            System.out.println("We will have a diet coke");
        }


        // amusement park roller coaster - small than 4 feet

        float height = 4f;

        if (height < 4) {
            System.out.println("You will not be able to ride the roller coaster");
        } else {
            System.out.println("Having a great time on the roller coaster");
        }
    }
}
