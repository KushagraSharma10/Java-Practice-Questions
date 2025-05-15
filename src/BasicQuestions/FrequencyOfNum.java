package BasicQuestions;

public class FrequencyOfNum {
    public static void main(String[] args) {
//        int count1 = 0;
//        int count2 = 0;
//        int count3 = 0;
//        int count4 = 0;

        int num = 11223344;
        int[] freq = new int[10];

        while (num > 0) {
            int lastDigit = num % 10;
//            if (lastDigit == 1) count1++;
//            else if (lastDigit == 2) {
//                count2++;
//            } else if (lastDigit == 3) {
//                count3++;
//            } else if (lastDigit == 4) {
//                count4++;
//            }

            freq[lastDigit]++;
            num = num / 10;
        }

//        System.out.println("1 -> " + count1);
//        System.out.println("2 -> " + count2);
//        System.out.println("3 -> " + count3);
//        System.out.println("4 -> " + count4);

        for (int i = 0; i <10 ; i++) {
            if(freq[i] > 0){
                System.out.println(i + " -> " + freq[i]);
            }
        }

    }
}
