package Tinkoff;


import java.util.*;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String[] s = scanner.nextLine().split(" ");
        int[] input = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            input[i]=Integer.parseInt(s[i]);
        }
        int[] result = checkStudents(input);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] checkStudents(int[] in){
        int evenMistakeNum = 0;
        int evenMistakes = 0;
        int oddMistakeNum = 0;
        int oddMistakes = 0;
        if (in.length<2){
            return new int[]{-1,-1};
        }
        else {
            for (int i = 0; i < in.length; i += 2) {
                if (in[i] % 2 == 0) {
                    evenMistakes++;
                    evenMistakeNum = i;
                }
            }
            for (int i = 1; i < in.length; i += 2) {
                if (in[i] % 2 != 0) {
                    oddMistakes++;
                    oddMistakeNum = i;
                }
            }
            if (evenMistakes==1 && oddMistakes==1){
                return new int[]{evenMistakeNum+1, oddMistakeNum+1};
            }
            else if(evenMistakes==0 && oddMistakes==0 && in.length>2){
                return new int[]{1, 3};
            }
            else{
                return new int[]{-1,-1};
            }
        }
    }
}

