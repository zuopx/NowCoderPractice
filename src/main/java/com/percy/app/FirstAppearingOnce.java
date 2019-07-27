package com.percy.app;

import java.util.Map;
import java.util.LinkedHashMap;

public class FirstAppearingOnce {

    StringBuffer str = null;
    Map<Character, Integer> map = null;
    Character ch = null;

    public FirstAppearingOnce() {
        str = new StringBuffer();
        map = new LinkedHashMap<>();
    }

    // Insert one char from stringstream
    public void insert(char ch) {
        str.append(ch);
        map.put(ch, map.getOrDefault(ch, 0) + 1);

        if (this.ch == null) {
            if (map.get(ch) == 1) {
                this.ch = ch;
            }
        } else {
            if (this.ch.equals(ch)) {
                this.ch = null;
                for (Character var : map.keySet()) {
                    if (map.get(var) == 1) {
                        this.ch = var;
                        break;
                    }
                }
            } 
        }
    }

    // return the first appearence once char in current stringstream
    public char firstAppearingOnce() {
        return ch == null ? '#' : ch.charValue();
    }
}