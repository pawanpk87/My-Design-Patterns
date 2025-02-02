package FlyweightCode;

import java.lang.Character;
import java.util.*;

public class CharacterFactory {
    private static final Map<Character, TextCharacter> letterMapChache = new HashMap();

    public static TextCharacter getLetter(char character) {
        if (!letterMapChache.containsKey(character)) {
            letterMapChache.put(character, new Letter(character));
        }
        return letterMapChache.get(character);
    }
}