public class Main {
    public static void main(String[] args) {
        float costTicket = 50000000.25F;
        int costMile = 20;
        int mileAmount;
        // наверное не имеет смысла учитывать отрицательно значение
        // стимости билета, т.к. это нелогично. Верно?
        if (costTicket > 0) {
            mileAmount = (int) costTicket / costMile;
        } else {
            mileAmount = 0;
        }
        System.out.println(mileAmount);
    }
}
