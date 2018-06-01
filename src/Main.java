import java.util.*;

public class Main {

    public static void main(String[] args) {
        int [] array = {5,3,0,2,4,1,0,5,2,3,1,4};
        System.out.println("Before: " + Arrays.toString(array));
        ShellSortSerial.sort(array);
        System.out.println("After: " + Arrays.toString(array));
    }
}
