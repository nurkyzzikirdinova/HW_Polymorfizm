public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                Shark shark = (Shark) animal;
                shark.attack();
            } else if (animal instanceof Turtle) {
                Turtle turtle = (Turtle) animal;
                turtle.swim();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.fly();
            }
        }

        Shark[] sharks = new Shark[1];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];

        int sharkIndex = 0, turtleIndex = 0, eagleIndex = 0;

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                sharks[sharkIndex++] = (Shark) animal;
            } else if (animal instanceof Turtle) {
                turtles[turtleIndex++] = (Turtle) animal;
            } else if (animal instanceof Eagle) {
                eagles[eagleIndex++] = (Eagle) animal;
            }
        }
    }
}
