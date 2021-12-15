package be.intec.Q103;

public class MainApp {

    public static void main(String[] args) {

        String[][] StringArr = {{"A","B","C"},{"D","E"}};

        for(int i=0 ; i<StringArr.length;i++){

            for(int j=0;j<StringArr[i].length;j++){

                System.out.println(StringArr[i][j]+" ");

                if(StringArr[i][j].equals("B")){

                    break; //break the inner loop and go to other iteration i =1
                }
            }
            continue;// is unnecessary as the last statement in a loop
        }

  //  so A B D E

    }

}
