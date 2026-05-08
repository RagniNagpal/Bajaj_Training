// LeetCode #365 - Water and Jug Problem
class WaterAndJugProblem {
    public boolean canMeasureWater(int x, int y, int target) {
        if (target > x + y) return false;
        if (target == 0 || target == x || target == y || target == x + y) return true;
        return target % gcd(x, y) == 0;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
