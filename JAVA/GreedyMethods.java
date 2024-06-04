import java.util.*;
public class GreedyMethods {
    public static void ActivitySelection() {
        int startTime[] = { 1, 3, 0, 5, 8, 5 };
        int endTime[] = { 2, 4, 6, 7, 9, 9 }; // endtime is sorted so that we get the activities which finish first

        int maxActivity = 0; // at this point we are saying that max activity is 0;
        ArrayList<Integer> answer = new ArrayList<>();

        maxActivity = 1; // 1st activity is always performed thus, maximum activity performed is 1
        answer.add(0); // so this happens to be 1st activity...

        int lastFinishTime = endTime[0];

        for (int i = 1; i < endTime.length; i++) {
            if (startTime[i] >= lastFinishTime) { //when the next activity starts and it doesn't overlap
                // select ad add the activity to the answer
                answer.add(i);
                maxActivity++; //maximum activity done by the person will increase by one for each check
                lastFinishTime = endTime[i];
            }
        }

        System.out.println("Maximum activity " + maxActivity);
        for (int i = 0; i < answer.size(); i++) {
            System.out.print("A" + answer.get(i) + " ");
        }
    }
    
    

    public static void main(String[] args) { 
        ActivitySelection();
    }
}
