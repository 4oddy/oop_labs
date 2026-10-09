public class Main {
  public static void main(String[] args) {
    Parrot p = new Parrot("kesha", 1, 100, 150, "black", "n word", true);
    p.learnWord("hello");
    p.learnWord("goodbye");
    p.speak();
    p.repeat("privet");
    for (String w : p.getVocabulary()) {
      System.out.println(w);
    }
  }
}
