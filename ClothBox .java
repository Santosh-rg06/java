public class ClothBox {
    public static void main(String[] args) {
        // Step 1: Define individual cloth variables
        String cloth1 = "Shirt";
        String cloth2 = "T-Shirt";
        String cloth3 = "Jeans";
        String cloth4 = "Jacket";
        String cloth5 = "Sweater";
        String cloth6 = "Hoodie";
        String cloth7 = "Blazer";
        String cloth8 = "Shorts";
        String cloth9 = "Skirt";
        String cloth10 = "Dress";
        String cloth11 = "Kurta";
        String cloth12 = "Saree";
        String cloth13 = "Suit";
        String cloth14 = "Coat";
        String cloth15 = "Dungarees";
        String cloth16 = "Leggings";
        String cloth17 = "Trousers";
        String cloth18 = "Capri";
        String cloth19 = "Tank Top";
        String cloth20 = "Sweatpants";
        String cloth21 = "Tracksuit";
        String cloth22 = "Scarf";
        String cloth23 = "Poncho";
        String cloth24 = "Windbreaker";
        String cloth25 = "Overcoat";

        // Step 2: Store in an array
        String[] clothes = {
            cloth1, cloth2, cloth3, cloth4, cloth5, cloth6, cloth7, cloth8, cloth9, cloth10,
            cloth11, cloth12, cloth13, cloth14, cloth15, cloth16, cloth17, cloth18, cloth19, cloth20,
            cloth21, cloth22, cloth23, cloth24, cloth25
        };

        // Step 3: Print a specific cloth (example: index 4)
        String ref = clothes[4]; // Sweater
        System.out.println("Cloth @ index 4: " + ref);

        // Step 4: Update a cloth at index 10
        clothes[10] = "Sherwani";

        // Step 5: Print updated cloth
        System.out.println("Updated Cloth @ index 10: " + clothes[10]);
    }
}