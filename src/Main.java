public class Main {
    public static void main(String[] args) {
        long amountInKopecks = 110000;
        long limit = 100000;
        long bonusPercent = 1;
        long bonus;
        if (amountInKopecks > limit) {
            bonus = amountInKopecks * bonusPercent / 100 / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
