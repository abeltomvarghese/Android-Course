public class ifStatements {
    public static void main (String[] args) {
        int[] nums = {9,9};
        if (nums[1] > nums[0]) {
            System.out.println("the second number is larger");
        } else if (nums[1] < nums[0]) {
            System.out.println("the first number is larger");
        } else {
            System.out.println("both numbers are equal");
        }
    }
}
