import java.util.Scanner;

public class Excecutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Excecutor excecutor = new Excecutor();

        System.out.println("Choose option: ");
        System.out.println("1 : English to Morse");
        System.out.println("2 : Morse to English");
        System.out.println("====================");
        System.out.print("Option : ");
        switch (scanner.nextInt()){
            case 1:
                excecutor.englishToMorse();
                break;

            case 2:
                excecutor.morseToEnglish();
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public void englishToMorse(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the English Message : ");
        String inputMessage = scanner.nextLine();
        String outputMessage = Converters.convertEnglishToMorse(inputMessage);
        System.out.print("Translated to Morse => ");
        System.out.println(outputMessage);
    }

    public void morseToEnglish(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Morse Message : ");
        String inputMessage = scanner.nextLine();
        String outputMessage = Converters.convertMorseToEnglish(inputMessage);
        System.out.print("Translated to English => ");
        System.out.println(outputMessage);
    }
}
