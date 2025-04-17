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
        int day=5;
        switch(day){
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
        }
    }
}