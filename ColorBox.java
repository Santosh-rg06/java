public class ColorBox {
    public static void main(String[] args) {
        // Defining individual color variables
        String color1 = "Black";
        String color2 = "Blue";
        String color3 = "Red";
        String color4 = "Yellow";
        String color5 = "Green";
        String color6 = "Orange";
        String color7 = "Purple";
        String color8 = "Pink";
        String color9 = "Brown";
        String color10 = "White";
        String color11 = "Gray";
        String color12 = "Cyan";
        String color13 = "Magenta";
        String color14 = "Lime";
        String color15 = "Olive";
        String color16 = "Maroon";
        String color17 = "Navy";
        String color18 = "Teal";
        String color19 = "Silver";
        String color20 = "Gold";
        String color21 = "Beige";
        String color22 = "Turquoise";
        String color23 = "Violet";
        String color24 = "Indigo";
        String color25 = "Lavender";
        String color26 = "Coral";
        String color27 = "Salmon";
        String color28 = "Amber";
        String color29 = "Crimson";
        String color30 = "Mint";

        // Storing all color variables in an array
        String[] colors = {
            color1, color2, color3, color4, color5, color6, color7, color8, color9, color10, color11,
            color12, color13, color14, color15, color16, color17, color18, color19, color20, color21, color22,
            color23, color24, color25, color26, color27, color28, color29, color30
        };

        // Referencing the color at index 1 (Blue)
        String ref = colors[1];
        
        // Printing the color at index 1
        System.out.println("Color @ index 1: " + ref);

        // Updating the color at index 2 (Red) to "Sky Blue"
        colors[2] = "Sky Blue";

        // Printing the updated color at index 2
        System.out.println("Updated color @ index 2: " + colors[2]);
    }
}
