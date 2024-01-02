import java.util.*;

public class dsa_Array {

    public static int trapped_Water(int height[]) {
        int size = height.length;

        // calculate the left max boundary
        // auxillary array
        int leftMax[] = new int[size];
        leftMax[0] = height[0];
        for (int i = 1; i < size; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate the right max boundary
        int rightMax[] = new int[size];
        rightMax[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop
        int trapped_Water = 0;
        for (int i = 0; i < size; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]); // w-x * width;
            trapped_Water += waterlevel - height[i];
        }

        return trapped_Water; // time compleixity = 0(n)
    }

    public static int buyAndsellStocks(int prices[]) {
        // time complexity = O(n)
        int buyPrice = Integer.MAX_VALUE; // max buy price (lets say infinity)
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // if profit
                int profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // if no profit or loss
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    
    public static int buyAndsellStocks2(int price[]) {
        // it if more optimised approach to calculte the maxmimm profit 
        // this algorithm uses Kadanes' algorithm
        // time complexity = O(n)

        int buyPrice = price[0];
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            int profit = price[i] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
            buyPrice = Math.min(buyPrice, price[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the size of the array : ");
        int size = input.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d element : ", i);
            arr[i] = input.nextInt();
        }

        System.out.print("Enter a choice : \n 1. Trapped Rainwater \n 2. Buy and sell Stocks \n");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("The total trapped water between towers is : " + trapped_Water(arr));
        } else if (choice == 2) {
            System.out.println("The maximum profit is : " + buyAndsellStocks2(arr));
        } else {
            System.out.println("Invalid Choice");
        }

        input.close();

    }
}