public class arraydemo {
    public static void main(String[] args) {
        int []num={1,2,3,4,5,6};
/*        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);

        System.out.println(num.length);*/

/*        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }*/

        int sum =0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        System.out.println("sum : "+sum);
        double avg = sum/ num.length;
        System.out.println("AVG : "+avg);
    }
}
