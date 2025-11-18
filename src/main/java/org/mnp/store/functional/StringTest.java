package org.mnp.store.functional;

public class StringTest {
    static void main() {
        String str1 = "Hello";
        str1.chars().forEach(ch->IO.println((char)ch));
    }
}
