public class Bird extends Animal {
  private double wingspan;
  private String color;
  private int eggsLaid;

  public Bird(String name, int age, double weight, double wingspan, String color) {
    super(name, age, weight);
    setWingspan(wingspan);
    setColor(color);
    this.eggsLaid = 0;
  }

  public void setWingspan(double wingspan) {
    if (wingspan > 0) {
      this.wingspan = wingspan;
      return;
    }
    throw new IllegalArgumentException("размах крыльев должен быть положительным");
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWingspan() {
    return this.wingspan;
  }

  public String getColor() {
    return this.color;
  }

  public int getEggsLaid() {
    return this.eggsLaid;
  }

  public void fly() {
    System.out.println(getName() + " летает.");
  }

  public void layEgg() {
    this.eggsLaid += 1;
  }

  public void buildNest() {
    System.out.println(getName() + " строит гнездо.");
  }
}
