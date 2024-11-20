//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


                Animal[] animals = new Animal[3];

                animals[0] = new Shark();
                animals[1] = new Turtle();
                animals[2] = new Eagle();


                for (Animal animal : animals) {
                    if (animal instanceof Shark) {

                        ((Shark) animal).attack();
                        System.out.println("Class: " + animal.getClass().getSimpleName());
                    } else if (animal instanceof Turtle) {

                        ((Turtle) animal).swim();
                        System.out.println("Class: " + animal.getClass().getSimpleName());
                    } else if (animal instanceof Eagle) {

                        ((Eagle) animal).fly();
                        System.out.println("Class: " + animal.getClass().getSimpleName());
                    }
                }


                Shark[] sharks = new Shark[1];
                Turtle[] turtles = new Turtle[1];
                Eagle[] eagles = new Eagle[1];

                sharks[0] = new Shark();
                turtles[0] = new Turtle();
                eagles[0] = new Eagle();


                sharks[0].attack();
                turtles[0].swim();
                eagles[0].fly();
            }
        }

