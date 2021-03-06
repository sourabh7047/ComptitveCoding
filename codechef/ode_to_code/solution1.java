package ode_to_code;

import java.util.*;
import java.io.*;

public class solution1 {
    static class FastReader {

        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;

        FastReader() {
            in = System.in;
        }

        int scan() throws IOException {
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0) {
                    return -1;
                }
            }
            return buf[index++];
        }

        String next() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan())
                ;
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan()) {
                sb.append((char) c);
            }
            return sb.toString();
        }

        String nextLine() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan())
                ;
            StringBuilder sb = new StringBuilder();
            for (; c != 10 && c != 13; c = scan()) {
                sb.append((char) c);
            }
            return sb.toString();
        }

        char nextChar() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan())
                ;
            return (char) c;
        }

        int nextInt() throws IOException {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan())
                ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }

        long nextLong() throws IOException {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan())
                ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
    }

    public static void main(String[] args) throws IOException {

        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();

            if (n == 3) {
                System.out.println(1 + " " + 1 + " " + 1);
            } else if (n % 2 == 0) {
                long divison = n / 2;
                if (divison % 2 == 0) {
                    System.out.println(divison + " " + divison / 2 + " " + divison / 2);
                } else {
                    long newval = divison - 1;
                    System.out.println(newval + " " + newval + " " + 2);
                }
            } else {
                long divison = n / 2;
                System.out.println(divison + " " + divison + " " + 1);
            }
        }
    }
}
