import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

            ArrayList<Integer> arrayList = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 50; i++) {
                arrayList.add(random.nextInt(100));

            }
            System.out.println(arrayList);
            ArrayList<Integer> arrayList1 = new ArrayList<>();
            for (Integer num: arrayList) {
                if (num%2==0) {
                    arrayList1.add(num);
                }


            }
            System.out.println(arrayList1);
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (Integer num: arrayList) {
                if (num%2!=0) {
                    arrayList2.add(num);
                }

            }
            System.out.println(arrayList2);
        }
        }


