import java.util.HashMap;

public class Converters {
    public static String convertEnglishToMorse(String englishMessage){
        MorseCodeMappings morseCodeMappings = new MorseCodeMappings();
        HashMap <String, String> mappings = morseCodeMappings.getMorseCodeMapping();
        String morseMessage = "";

        if(englishMessage.isEmpty() || englishMessage.isBlank()){
            return "";
        } else {
            englishMessage = englishMessage.replaceAll("[^a-zA-Z0-9]", " ");
            String[] words = englishMessage.split(" ");
            for(String word : words){
                char[] letters = word.toCharArray();
                for(char letter : letters){
                    morseMessage += mappings.get(String.valueOf(letter).toUpperCase());
                    morseMessage += morseCodeMappings.LETTER_SPACING;
                }
                morseMessage = morseMessage.trim();
                morseMessage += morseCodeMappings.WORD_SPACING;
            }
            morseMessage = morseMessage.trim();
        }

        return morseMessage;
    }

    public static String convertMorseToEnglish(String morseMessage){
        MorseCodeMappings morseCodeMappings = new MorseCodeMappings();
        HashMap <String, String> reverseMappings = morseCodeMappings.getReverseMapping();
        String englishMessage = "";
        if(morseMessage.isEmpty() || morseMessage.isBlank()){
            return "";
        } else {
            String[] words = morseMessage.trim().split(morseCodeMappings.WORD_SPACING);
            for(String word : words){
                String[] letters = word.split(morseCodeMappings.LETTER_SPACING);
                for(String letter : letters){
                    englishMessage += reverseMappings.get(letter);
                }
                englishMessage += " ";
            }
        }
        return englishMessage;
    }
}
