import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<>();
        System.out.print("Enter five integers and five doubles: ");
        
        for(int i=0;i<5;i++){
            int k=input.nextInt();
            list.add(k);
        }
        for(int i=0;i<5;i++){
            double k=input.nextDouble();
            list.add(k);
        }
        /*
            list 입력 코드
         */

        sort(list);

        /*
            list 출력 코드
         */
        for(int i=0; i<10 ; i++){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void sort(ArrayList<Number> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).doubleValue() > list.get(j).doubleValue()) {
                    Number temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
 }

