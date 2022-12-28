public class Main {
    public static void main(String[] args) {
      Cat cat = new Cat("Barsik", "siam", "Ivan Sidorov");
      Award aw = new Award(1, "World Cat Year");
      cat.addAward(aw);
      System.out.println(cat);
    }
}
