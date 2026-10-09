import java.util.List;
import java.util.ArrayList;

public class Parrot extends Bird {
  private List<String> vocabulary;
  private String favoriteWord;
  private boolean tame;

  public Parrot(String name, int age, double weight,
      double wingspan, String color, String favoriteWord, boolean isTame) {
    super(name, age, weight, wingspan, color);
    this.favoriteWord = favoriteWord;
    this.tame = isTame;
    this.vocabulary = new ArrayList<>();
  }

  public void makeTame() {
    this.tame = true;
  }

  public void setFavoriteWord(String word) {
    if (vocabulary.contains(word)) {
      this.favoriteWord = word;
      return;
    }

    throw new IllegalArgumentException("Такого слова нет в словаре.");
  }

  public void setVocabulary(List<String> vocabulary) {
    this.vocabulary = vocabulary;
  }

  public boolean isTame() {
    return this.tame;
  }

  public List<String> getVocabulary() {
    return this.vocabulary;
  }

  public String getFavoriteWord() {
    return this.favoriteWord;
  }

  public void speak() {
    System.out.println(this.favoriteWord);
  }

  public void repeat(String word) {
    System.out.println(word);
  }

  public void learnWord(String word) {
    if (!vocabulary.contains(word)) {
      vocabulary.add(word);
    }
  }
}
