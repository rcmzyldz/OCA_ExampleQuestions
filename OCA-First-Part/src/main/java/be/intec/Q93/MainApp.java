package be.intec.Q93;

public class MainApp {

    public static void main(String[] args) {
        int[][] num = new int[1][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                num[i][j] = 10;
                System.out.println("num[" + i + "][" + j + "]= " + num[i][j]);

                // output
//                num[0][0]= 10
//                num[0][1]= 10
//                num[0][2]= 10

                //    the answer is A
            }
        }
    }

}