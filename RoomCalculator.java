import java.util.Scanner;

public class RoomCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.printf("Enter floor length (m): ");
        float length = sc.nextFloat();

        System.out.printf("Enter floor width (m): ");
        float width = sc.nextFloat();

        System.out.printf("Enter wall height (m): ");
        float height = sc.nextFloat();

        float area = length*width;
        float wall= height*width*2+height*length*2;
        float paint= wall/12;
        float vol= height*width*length;

        System.out.format("\nArea of floor: %fm\u00B2\nAmount of paint required: %fL (at 60m\u00B2/5L)\nVolume of room: %fm^3", new Object [] {area, paint, vol});

        }
}
