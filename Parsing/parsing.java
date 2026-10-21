/*

Parsing = means reading information and breaking it into meaningful
    pieces that your program can understand it and work with

This program will read a txt file with the ticket information.
The goal is to read the HUB light level "hub -13.34",
"house -14.33", "wifi 546/542", "hardline 1003/1040"

Rules:
1) the text file has a consistent format
2) labels are spelled correctly: hub, house, wifi, hardline
3) light levels can be positive or negative
4) we will ignore spelling mistakes and unexpected formats for now

*/

import java.util.Scanner;
import java.io.File;


public class parsing {
    public static void main(String[] args) throws Exception {

    
        // First extract the hub light level
        Scanner scan = new Scanner(new File("ticket.txt"));
        
        String line1 = scan.nextLine();
        String line2 = scan.nextLine();

        // next() = reads the first token (hub)
        String line3 = scan.nextLine();

        String wifi = "";
        String wifi1 = "";
        String wifi2 = ""; 
        boolean separator = false;

        for (int i = 0; i < line3.length(); i++) {
            char c = line3.charAt(i);

            if (separator == false && Character.isDigit(c)) {
                wifi1 += c;
            }

            if (c == '/') {
                separator = true;
            }

            if (separator && Character.isDigit(c)) {
                wifi2 += c;
            }

        }
        System.out.print(wifi1 + " " + wifi2);
            
    }
}