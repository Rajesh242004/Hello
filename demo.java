public class demo{
    public static void main (String args[]){

        int a = 1;
        while(a<=5){
            System.out.println("hello");
            int b = 1;
            while(b<=3){
                System.out.println("hi");
                b++;
            }
            a++;
        }
        int[] num = {1, 2, 3, 4};
        for(int i=0;i<=5;i++){
            System.out.println("java");
            for (int j = 1; j < num.length;j++){
                System.out.println("programming");
            }

        }
    }
}