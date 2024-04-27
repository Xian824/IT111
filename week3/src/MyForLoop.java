public class MyForLoop {

    public static  void main(String[]args){

int count;
        for(count = 0; count <= 20; count = count+2) {
            System.out.println(count);

        }
        System.out.println("All Done");

        int newcount;

        for(newcount = 30; newcount > 0; newcount = newcount - 1) {

            if(newcount <= 10) {
                System.out.println("We are almost at blast off! Only " +newcount+ " seconds away");

            } else {
                System.out.println(newcount);
            }


        } // end for loop

        System.out.println("Blast off");
    }
}
