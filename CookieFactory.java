import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        boolean hasFlour = false;
        boolean hasEggs = false;
        boolean hasSugar = false;
        int batchCounter = 1;
        while(batchCounter <= count) {
            String command;
            while (true){
                command = scanner.nextLine();

                if ("flour".equals(command)) {
                    hasFlour = true;
                } else if ("eggs".equals(command)) {
                    hasEggs = true;
                } else if ("sugar".equals(command)) {
                    hasSugar = true;
                }
                if (command.equals("Bake!")) {
                    if (hasEggs && hasFlour && hasSugar) {
                        System.out.printf("Baking batch number %d...%n", batchCounter++);
                        hasEggs = hasFlour = hasSugar = false;
                    } else {
                        System.out.println("The batter should contain flour, eggs and sugar!");
                    }
                    break;
                }
            }
        }
    }
}