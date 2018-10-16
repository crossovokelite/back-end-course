package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Formatter {

    public void format(BufferedReader source, BufferedWriter result) {

        try {

            int tab = 0;
            int symbol;
            while ((symbol = source.read()) != -1) {
                switch (symbol) {
                    case '{':
                        result.write(symbol);
                        result.write("\n");
                        tab++;
                        for (int i = 0; i < tab; i++) {
                            result.write(" ");
                        }
                        break;
                    case ';':
                        result.write(symbol);
                        result.write('\n');
                        for (int i = 0; i < tab; i++) {
                            result.write(" ");
                        }
                        break;
                    case '}':
                        result.write(symbol);
                        result.write("\n");
                        tab--;
                        for (int i = 0; i < tab; i++) {
                            result.write(" ");
                        }
                        break;
                    default:
                        result.write(symbol);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
