package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int lastPostIndex = post.length - 1;
        int lastWordIndex = word.length - 1;
        for (int index = 0; index < post.length; index++) {
            if (post[lastPostIndex - index] != word[lastWordIndex - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
