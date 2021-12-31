    package com.company;

    import java.util.Scanner;

    public class test {
        public static void test1(){
            Scanner input = new Scanner(System.in);
            int m = input.nextInt();
            int tc = input.nextInt();
            int th = input.nextInt();
            int ct = 2;
            int ht = 1;

            for(int i=1; i<m; i++){
                tc +=ct;
                th -=ht;
                if(tc == th){
                    break;
                }
            }
            if(tc !=th){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }



        }
    }
