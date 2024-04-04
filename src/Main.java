//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Airbus-A310","white+white" ,220 );
        Airplane plane2 = new Airplane("ИЛ-62", "white + blue",195);
        Airplane plane3 = new Airplane("Boeing-777", "gray", 550 );
        Airplane plane4 = new Airplane(" ТУ-154", "white", 180 );
    plane1.toString();


    }
}

    class Airplane{
        static private String name;
        static private String color;
        static private int capacity;


        public Airplane(String name, String color, int capacity) {
            this.name = name;
            this.color = color;
            this.capacity = capacity;
        }


        public static void setName(String name) {
            Airplane.name = name;
        }

        public static void setColor(String color) {
            Airplane.color = color;
        }

        public static void setCapacity(int capacity) {
            Airplane.capacity = capacity;
        }

        public static String getName() {
            return name;
        }

        public static String getColor() {
            return color;
        }

        public static int getCapacity() {
            return capacity;
        }

        @Override
        public String toString(String name,  String color, int capacity ) {
            return "Самолёт {" +
                     name + '\'' + "цвет='" +
                    "вместимость" + capacity +
                    '}';
        }

    }


