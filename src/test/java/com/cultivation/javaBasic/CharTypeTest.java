package com.cultivation.javaBasic;

import com.cultivation.javaBasic.util.EscapedChars;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharTypeTest {
    @Test
    void should_describe_escaped_chars() {
        // TODO: please modify the following code to pass the test
        // <--start
        final char backspace = 8;
        final char tab = 9;
        final char lineFeed = 10;
        final char carriageReturn = 13;
        final char doubleQuote = 0x22;
        final char singleQuote = 0x27;
        final char backslash = 0x5C;
        // --end-->

        assertEquals(EscapedChars.BACKSPACE.getValue(), backspace);
        assertEquals(EscapedChars.TAB.getValue(), tab);
        assertEquals(EscapedChars.LINE_FEED.getValue(), lineFeed);
        assertEquals(EscapedChars.CARRIAGE_RETURN.getValue(), carriageReturn);
        assertEquals(EscapedChars.DOUBLE_QUOTE.getValue(), doubleQuote);
        assertEquals(EscapedChars.SINGLE_QUOTE.getValue(), singleQuote);
        assertEquals(EscapedChars.BACKSLASH.getValue(), backslash);
    }
}
