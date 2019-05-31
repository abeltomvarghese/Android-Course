public class numberShapes {
    public static void main (String[] args) {
        number myNum = new number();
        System.out.println(myNum.isSquare());
    }
}

class number {
    int num = 8;
    public boolean isTriangular() {
        double testNum = Math.sqrt(this.num * 2);
        testNum = Math.floor(testNum);
        if ((testNum *(testNum+1))/2 == num) {
            return true;
        }
        return false;
    }
    public boolean isSquare(){
        double squareRoot = Math.sqrt(num);
        if (squareRoot == Math.floor(squareRoot)) {
            return true;
        }

        return false;
    }
}