//// missing name

public class exercise{
    public static void main(String[]args){
        //1  5
        int j1 = 0;
        for (int g1 = 0; g1 < 5; g1++)
            j1++;
        System.out.println(j1);

        //2  8
        int s2 = 1;
        for (int j2 = 3; j2 >= 0; j2--) {
            s2 = s2 + j2;
        }
        System.out.println(s2);

        //3  56
        int p3 = 6;
        int m3 = 20, j3;
        for (j3 = 1; j3 < p3; j3++);
        {
            m3 = m3 + j3 * j3;
        }
        System.out.println(m3);

        //4  9
        double a4 = 1.0;
        int j4;
        for (j4 = 0; j4 < 9; j4++) {
            a4 *= 3;
        }
        System.out.println(j4);

        //5  28
        int b5 = 0;
        for (int iMus5 = 0; iMus5 < 10; iMus5++) {
            b5 = 19 + iMus5;
        }
        System.out.println(b5);

        //6  110.01
        double d6 = 100.01;
        int b6 = 0;
        for (int iMus6 = 0; iMus6 < 10; iMus6++) {
            b6 = 19 + iMus6;
            d6++;
        }
        System.out.println(d6);

        //7  3 6 12 24 48
        int num7 = 3;
        for (int i7 = 0; i7 < 5; i7++) {
            System.out.println(num7);
            num7 *= 2;
        }

        //8  24 12 6 3
        for (int num8 = 24; num8 >= 3; num8 /= 2) {
            System.out.println(num8);
        }

        //9  5
        int k9 = 0;
        for (int j9 = 0; j9 <= 10; j9++) {
            if (j9 == 5) {
                break;
            } else {
                k9++;
            }
        }
        System.out.println(k9);

        //10  termination condition
        System.out.println("termination condition");

        //11  j = 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
        for (int i11 = 10; i11 <= 100; i11 += 10) {
            int j11 = i11 / 2;
            System.out.println(j11);
        }

        //12  16
        int r12 = 0, j12;
        for (j12 = 1; j12 < 10; j12 = j12 * 2) {
            r12 = 2 * j12;
        }
        System.out.println(r12);

        //13  Infinite loop is the worst sin
        System.out.println("Infinite loop");

        //14  137
        int count14 = 0;
        for (int p14 = 9; p14 <= 145; p14++) {
            count14++;
        }
        System.out.println(count14);


        //1  C //// correct answer: B
        //2  C
        //3  B //// correct answer: A
        //4  E
        //5  A //// correct answer: D
        //6  C //// correct answer: A
        //7  D
    }
}
