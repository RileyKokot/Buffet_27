/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        int red = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);
        getColor(red, green, blue);
        System.out.println(" This is a random color");

        getColor(255-red, 255-green, 255-blue);
        System.out.println(" This is a random color complementary to the last one");

        getColor(blue, red, green);
        System.out.println(" This is a random triadic(BRG) color");
        getColor(green, blue, red);
        System.out.println(" This is a random triadic(GBR) color");

        int darkred = (int)(Math.random()*128);
        int darkblue = (int)(Math.random()*128);
        int darkgreen = (int)(Math.random()*128);

        getColor(darkred, darkgreen, darkblue);
        System.out.println(" This is a random dark color");

        int lightred = (int)(Math.random()*127+128);
        int lightblue = (int)(Math.random()*127+128);
        int lightgreen = (int)(Math.random()*127+128);

        getColor(lightred, lightgreen, lightblue);
        System.out.println(" This is a random light color");
        getColor(darkred, darkgreen, lightblue);
        System.out.println(" This is a random Blueish color");
        getColor(lightred, lightgreen, darkblue);
        System.out.println(" This is a random greenishcolor");




		

		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "        " + resetColor;
        System.out.println(swatch);
        
    }
}
