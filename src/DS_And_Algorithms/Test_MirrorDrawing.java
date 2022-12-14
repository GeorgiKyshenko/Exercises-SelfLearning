package DS_And_Algorithms;

import java.util.Scanner;

public class Test_MirrorDrawing {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());

        draw(number, "$", "@");
    }

    private static void draw(int number, String signTop, String signBottom) {

        if(number == 0) return;

        System.out.println(drawRow(number, signTop));

        draw(number-1, signTop, signBottom);

        System.out.println(drawRow(number, signBottom));
    }

    private static String drawRow(int number, String sign){
        //return sign.repeat(number); - не минава в judge

        String row = "";

        for(int i = 0; i < number; i++){
            row += sign;
        }

        return row;
    }
}
