package FlyweightCode;

import java.util.HashMap;
import java.util.Map;

public class FormattedFactory {
    private static Map<FormattingContext, FormattedText> cache = new HashMap<FormattingContext, FormattedText>();

    public static FormattedText getFormattedText(String text, String font, int size, String color) {
        FormattingContext context = new FormattingContext(font, size, color);
        if (!cache.containsKey(context)) {
            cache.put(context, new FormattedText(text, context));
        }
        return cache.get(context);
    }
}
