package cinema;

import java.util.Scanner;

public class Cinema {

    static int getIncome(int seats, int rows){
        int FRONT_SEAT_PRICE = 10;
        int BACK_SEAT_PRICE = 8;
        int totalIncome = 0;
        int frontSeatsCount = 0;
        int backSeatsCount = 0;

        int totalSeatsCount = rows * seats;

        if(seats * rows <= 60){
            totalIncome += totalSeatsCount * FRONT_SEAT_PRICE;
        }

        if(seats * rows > 60){
            frontSeatsCount = Math.floorDiv(rows, 2) * seats;
            backSeatsCount = (totalSeatsCount - frontSeatsCount);

            totalIncome += (frontSeatsCount * FRONT_SEAT_PRICE) + (backSeatsCount * BACK_SEAT_PRICE);
        }
        return totalIncome;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cinema:");
        System.out.println(" 1 2 3 4 5 6 7 8");
        for(int i = 1; i < 8; i++){
            String str = String.format("%d %s", i, "S S S S S S S S");
            System.out.println(str);
        }

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        int income = getIncome(seats, rows);


        System.out.println("Total income:");
        System.out.println("$" + income);

    }


}