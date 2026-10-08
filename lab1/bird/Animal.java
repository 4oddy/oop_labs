public class Animal {
  private String name;
  private int age;
  private double weight;

  private static double foodToWeightRatio = 0.1;

  public Animal(String name, int age, double weight) {
    setName(name);
    setAge(age);
    setWeight(weight);
  }

  public void setAge(int age) {
    if (age >= 0) {
      this.age = age;
      return;
    }
    throw new IllegalArgumentException("возраст должен быть неотрицательным");
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(double weight) {
    if (weight >= 0) {
      this.weight = weight;
      return;
    }
    throw new IllegalArgumentException("вес должен быть неотрицательным");
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public double getWeight() {
    return this.weight;
  }

  public void eat(double foodAmount) {
    System.out.println(this.name + " ест.");
    this.weight += foodAmount * foodToWeightRatio;
  }

  public void makeSound() {
    System.out.println(this.name + " издает звук.");
  }

  public void becomeOlder() {
    this.age += 1;
    System.out.println(name + " стал(а) старше на год");
  }

}
