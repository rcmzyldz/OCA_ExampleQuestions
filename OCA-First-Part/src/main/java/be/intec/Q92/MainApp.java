package be.intec.Q92;

public class MainApp {
    public static void main(String[] args) {
        int intArr[] = {15,30,45,60,75};
        intArr[2]=intArr[4];
        intArr[4]=90;
        for(int n:intArr){
            System.out.print(n + " ");
        }
    }
  //  result 15 30 75 60 90
}
