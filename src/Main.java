import java.util.Scanner;
public class Main {

    public static void main (String[] args){
        //getIntegers(5);
       // sortIntegers(getIntegers(5));
        //printArray(sortIntegers(getIntegers(5)));
        printArray(sortIntegers(getIntegers(5)));
    }

    public static int[] getIntegers(int sizeArray){
        Scanner keyboard = new Scanner(System.in);

        int[] userArray = new int[sizeArray];

        System.out.println("Enter an integer: ");
        for (int i = 0; i < userArray.length; i++){
            userArray[i] = keyboard.nextInt();
        }
        return userArray;
    }

    public static void printArray(int[] userArrayList){
        for (int i = 0; i < userArrayList.length; i++){
            System.out.println("Element " + i + " contents " + userArrayList[i]);
        }
    }
    //todo: sorting error example = 1 2 3 4 5 but output = 2 3 4 5 1
    public static int[] sortIntegers(int[] userArray){
        int[] userArrayList = new int[userArray.length];

        for(int i = 0; i < userArray.length; i ++){
            userArrayList[i] = userArray[i];
        }

        int temp = 0;
        for ( int i = 0; i < userArrayList.length; i++) {
            for (int j = i + 1; j < userArrayList.length; j++) {
                if (userArrayList[i] < userArrayList[j]) {
                    temp = userArrayList[i];
                    userArrayList[i] = userArrayList[j];
                    userArrayList[j] = temp;
                }
            }
        }
        return userArrayList;
    }
}