package IntellijStarting.test;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(3, 0, 15));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigBagSize = 5;
        int smallBagSize = 1;
        while (goal >= bigBagSize && goal >= bigCount && bigCount>0) {
            bigCount--;
            goal -= bigBagSize;
        }
        while (goal >= smallBagSize && smallCount>0) {
            smallCount--;
            goal -= smallBagSize;
        }
        if (goal == 0) {
            return true;
        }
        else if(goal < bigBagSize) {
            return false;
        }
        return false;
    }
}
