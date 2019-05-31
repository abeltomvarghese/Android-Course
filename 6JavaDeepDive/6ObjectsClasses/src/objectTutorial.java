public class objectTutorial {
    public static void main (String[] args) {
        num myNum = new num();
        if (myNum.positiveNegative()) {
            System.out.println("The number " + myNum.num + " is positive");
        } else {
            System.out.println("The number " + myNum.num + " is negative");
        }

    }
}

class num {
    int num = -12;
    public boolean positiveNegative() {
        if (num > 0) {
            return true;
        }
        return false;
    }
}