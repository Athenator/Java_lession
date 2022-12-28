package home;
// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
public class tsk_4 {
    public static void main(String[] args) {
        int m = 0;
        int[] massOne = new int[] { 122, 384, 552, 322, 888, 342 };
        int[] massTwo = new int[] { 1, 2, 3, 4, 5, 6 };
        for (int i = 0, j = 1; i < massTwo.length - 1; i++, j++) {
            if (massOne[i] >= massOne[j]){ 
                m+=1;
            }
        }
        if (m == 0){ 
             System.err.println("Этот массив - возрастающая последовательность");
        }else{
            System.err.println("Этот массив - не возрастающая последовательность");
        }

    }


}
