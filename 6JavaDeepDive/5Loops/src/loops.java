import java.util.ArrayList;
import java.util.List;

public class loops {
    public static void main (String[] args) {
        //While loop
        int x = 1;
        while (x <=10) {
            System.out.println(x);
            x++;
        }
        System.out.println("**************");
        int y = 1;
        while (y <= 5) {
            System.out.println(2 * y);
            y++;
        }
        for (int j = 1; j <= 5;j++) {
            System.out.println(j*2);
        }
        int counter = 0;
        System.out.println("First Triangular numbers: ");
        for (int tri = 1;tri <=10;tri++) {
            counter = tri + counter;
            System.out.println(counter);
        }

        System.out.println("Multiples of three: ");
        for (int mult = 1;mult < 10;mult++) {
            System.out.println(mult * 3);
        }

        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        for (int num : nums) {
            System.out.println(num);
        }

        List<String> familyMembers = new ArrayList<>();
        familyMembers.add("Philip");
        familyMembers.add("Charles");
        familyMembers.add("Andrew");
        familyMembers.add("William");
        familyMembers.add("Harry");
        familyMembers.add("George");
        familyMembers.add("Louis");
        for (String names : familyMembers) {
            System.out.println(names);
        }
    }
}
