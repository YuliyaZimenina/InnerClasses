package local_class_demo;

// Nesting an inner class in a code block
public class LocalClassDemo {
    public static void main(String[] args) {
        // Class ShowBits as a inner class
        class ShowBits {
            int numBits;

            ShowBits(int n) {
                numBits = n;
            }

            void showBitsMethod(long value) {
                long mask = 1;

                //Shift the value 1 to the left to the desired position
                mask <<= numBits - 1;

                int spacer = 0;
                for (; mask != 0; mask >>>= 1) {
                    if ((value & mask) != 0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if ((spacer % 8) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }
        for (byte b = 0; b < 10; b++){
            ShowBits byteValue = new ShowBits(8);
            System.out.print(b + " in binary code: ");
            byteValue.showBitsMethod(b);
        }
    }
}

