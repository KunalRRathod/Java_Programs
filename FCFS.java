import java.util.Scanner;

public class Fcfs {

    public static void main(String[]args){

        Scanner x = new Scanner(System.in);

        int choice,burstTime1,burstTime2,burstTime3,burstTime4,burstTime5;

        int a1,a2,a3,a4,a5;

        int awt,atat;

        int at=5;

        System.out.println("Choices");

        System.out.println("[1]= 3 process");

        System.out.println("[2]= 4 process");

        System.out.println("[3]= 5 process");

        System.out.println("Enter Your choice: ");

        choice=x.nextInt();

        switch(choice){

        case 1:

            System.out.println("Enter Burst Time for Process 1: ");

            burstTime1=x.nextInt();

            System.out.println("Enter Burst Time for Process 2: ");

            burstTime2=x.nextInt();

            System.out.println("Enter Burst Time for Process 3: ");

            burstTime3=x.nextInt();

            a1=burstTime1+at;

            a2=burstTime2+a1;

            a3=burstTime3+a2;

            awt= (at+a1+a2)/3-at;

            System.out.println("Average Waiting Time:" +awt);

            atat= (a1+a2+a3)/3-at;

            System.out.println("Average Waiting Time:" +atat);

        break;

        case 2:

            System.out.println("Enter Burst Time for Process 1: ");

            burstTime1=x.nextInt();

            System.out.println("Enter Burst Time for Process 2: ");

            burstTime2=x.nextInt();

            System.out.println("Enter Burst Time for Process 3: ");

            burstTime3=x.nextInt();
            System.out.println("Enter Burst Time for Process 4: ");
            burstTime4=x.nextInt();
            a1=burstTime1+at;
            a2=burstTime2+a1;
            a3=burstTime3+a2;
            a4=burstTime4+a3;

            awt = (at+a1+a2+a3)/4-at;

            System.out.println("Average Waiting Time:" +awt);

            atat= (a1+a2+a3+a4)/4-at;

            System.out.println("Average Waiting Time:" +atat);

             
        case 3:

            System.out.println("Enter Burst Time for Process 1: ");

                burstTime1=x.nextInt();

            System.out.println("Enter Burst Time for Process 2: ");

            burstTime2=x.nextInt();

            System.out.println("Enter Burst Time for Process 3: ");

           burstTime3=x.nextInt();

            System.out.println("Enter Burst Time for Process 4: ");

            burstTime4=x.nextInt();

            System.out.println("Enter Burst Time for Process 5: ");

            burstTime5=x.nextInt();

            a1=burstTime1+at;

            a2=burstTime2+a1;

            a3=burstTime3+a2;

            a4=burstTime4+a3;

            a5=burstTime5+a4;

            awt = (at+a1+a2+a3+a4)/5-at;

            System.out.println("Average Waiting Time:" +awt);

            atat= (a1+a2+a3+a4+a5)/5-at;

            System.out.println("Average Waiting Time:" +atat);

            break;
       
           
        }
       
       
    }
}
