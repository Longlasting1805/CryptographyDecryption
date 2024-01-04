import java.util.Scanner;

public class decryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four encrypt numbers to decrypt: ");
        int encryptedNumbers = scanner.nextInt();

        // decrypt the number
        int decryptedNumber = decrypt(encryptedNumbers);

        System.out.println("Decrypted number: " + decryptedNumber);
    }

    public static int decrypt(int number){
        // Swap the first and third digits, and the second and fourth digits
        int digit1 = number % 1000 / 100;
        int digit2 = number % 100 / 10;
        int digit3 = number / 1000;
        int digit4 = number % 10;

        // Reverse the encryption by subtracting 7 and taking the remainder after dividing by 10
        digit1 = (digit1 + 3) % 10;
        digit2 = (digit2 + 3) % 10;
        digit3 = (digit3 + 3) % 10;
        digit4 = (digit4 + 3) % 10;

        return digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;

    }
}
