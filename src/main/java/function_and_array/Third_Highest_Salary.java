package function_and_array;

//3. Suppose, in a company , here are some employee salaries in an array
//        [35000, 25000, 28000, 32500, 44000, 32800]
//        Find out the 3rd highest salary

public class Third_Highest_Salary {

    public static void main(String[] args) {
        int firstHighest = 0;
        int secondHighest = 0;
        int thirdHighest = 0;

        int[] employSalary = {35000, 25000, 28000, 32500, 44000, 32800};

        for (int i = 0; i < employSalary.length; i++) {
            if (employSalary[i] > firstHighest) {
                thirdHighest = secondHighest;
                secondHighest = firstHighest;
                firstHighest = employSalary[i];
            } else if (employSalary[i] > secondHighest) {
                thirdHighest = secondHighest;
                secondHighest = employSalary[i];
            } else if (employSalary[i] > thirdHighest) {
                thirdHighest = employSalary[i];
            }
        }
        System.out.println("Third highest salary is: " + thirdHighest);
    }
}