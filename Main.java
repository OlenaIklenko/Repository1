package ua.epam;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Task_1
        // task 1_1

        System.out.println(12 * (4 / 3) + 158 * 2);

        // task 1_2
        int a=14;
        System.out.println(a/(20*9)+a*(29-a*2+a/3));

         //task 1_3
        int q=21;
        int w=8;
        int c=q/w;
        int b=q%w;
        System.out.println("21/8 equals " +c +" and "+b+ " in the remains.");


        //Task_2

        //task 2_1
        int n = 78;
        System.out.println(n/10+n%10);

        //task 2_2
        int n1 = 111;
        System.out.println(n1/100+(n1%100)/10+n1%10);

        //task 2_3
        int n2 = 78;
        System.out.println(n2/10+n2%10);

        //task 2_4
        double n3 = 78.3;
        System.out.println(Math.round(n3));



        //Task 3

        //task 3_1
        int n4 = 78;
        if(n4%2==0)System.out.println("even");
        else System.out.println("odd");

        //Task 3_2
        double m = 8.5;
        double n5 = 13.5;
        if(Math.abs(10-m)<Math.abs(10-n5))System.out.println(m);
        else System.out.println(n5);

        //Task 3_3
        int d = (int) (Math.random()*1000);
        System.out.println("d="+d);
        int d1 = d/100;
        int d2 = (d%100)/10;
        int d3 = d%10;
        if(d1>d2 && d1>d3)System.out.println(d1);
        else if(d2>d1 && d2>d3)System.out.println(d2);
        else if(d3>d1 && d3>d2)System.out.println(d3);
        else System.out.println("Equal");

        //Task 3_4
        int min = 5;
        int max = 155;

        int range = (max - min) + 1;
        int number = (int)(Math.random() * range) + min;
        System.out.println(number);
        if(number>25 && number<100)System.out.println("The number "+number+" is in the interval(25,100)");
        else System.out.println("The number "+number+" is not in the interval(25,100)");

        //Task 3_5
        int s=8,g=1,h=-3;
        System.out.println("The numbers in variables s, g, h: "+s+" "+g+" "+h);
        if(s<g&s<h){
            if(g<h)System.out.println("increasing sequence "+s+" "+g+" "+h);
            else System.out.println("increasing sequence "+s+" "+h+" "+g);
        }
        if(g<s&g<h){
            if(s<h)System.out.println("increasing sequence "+g+" "+s+" "+h);
            else System.out.println("increasing sequence "+g+" "+h+" "+s);
        }
        if(h<s&h<g){
            if(s<g)System.out.println("increasing sequence "+h+" "+s+" "+g);
            else System.out.println("increasing sequence "+h+" "+g+" "+s);
        }



        //Task 3_6
        int min1 = 0;
        int max1 = 28800;

        int range1 = (max1 - min1) + 1;
        int secondsLeft = (int)(Math.random() * range1) + min1;

        int hoursLeft = secondsLeft/3600;

        if(hoursLeft > 0)System.out.println("Seconds left: " +secondsLeft+"\n"+"Hours left: "+hoursLeft);
        else System.out.println("Seconds left: " +secondsLeft+"\n"+"It is less than an hour");














    }
}
