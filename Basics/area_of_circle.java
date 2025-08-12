public class area_of_circle {
    public static void main(String[] args) {
        /*
         * Variables are declared as the 'float' data type because pi is a decimal value.
         * Using the 'int' data type would cause a lossy conversion, leading to an inaccurate result.
         */
        float r = 2;
        float pie = 3.14f;  // Using Math.PI (a double) is an alternative for better precision.
                            // If used, the other variables should also be of type double.

        float area = pie * r * r;
        System.out.println("The area of circle is: " + area);
    }
}