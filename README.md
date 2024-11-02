# Vigenere Cipher GUI Application

This project provides a simple Java Swing-based GUI application that allows users to encrypt and decrypt text using the Vigenere Cipher. This application is built using Java and the FlatLaf library for a modern, dark-themed look and feel.

## Features
- **Encrypt (Cifrar):** Encrypt text using the Vigenere Cipher algorithm.
- **Decrypt (Decifrar):** Decrypt previously encrypted text back to its original form.
- **MD5 Hashing:** Generate an MD5 hash from a string, although this feature is implemented internally and not exposed through the GUI.

## Technologies Used
- **Java Swing:** For creating the GUI interface.
- **FlatLaf:** For setting a modern dark theme.
- **Java Security Library:** For MD5 hashing functionality.

## Installation and Setup
1. **Clone the Repository**
   ```bash
   git clone https://github.com/WillGolden80742/Vigenere.git
   cd Vigenere
   ```

2. **Set Up Dependencies**
   - Ensure you have Java JDK (version 8 or higher) installed.
   - Install FlatLaf. This can be added as a dependency in your IDE or added directly in the project build file if using a build tool like Maven.

3. **Compile and Run**
   - Open the project in your preferred Java IDE (like IntelliJ or Eclipse).
   - Compile and run the `Vigenere.java` class.

## Usage
1. **Launch the Application:** Run the main method in `Vigenere.java`.
2. **Encrypt Text**
   - Enter the text to be encrypted in the input field.
   - Provide a key in the "Chave" field.
   - Click on the "Cifrar" button to encrypt the text. The encrypted result will appear in the output field.
3. **Decrypt Text**
   - Enter the text to be decrypted in the input field.
   - Provide the same key used for encryption in the "Chave" field.
   - Click on the "Decifrar" button to decrypt the text. The decrypted result will appear in the output field.

> **Note:** The Vigenere Cipher requires the key to be the same for both encryption and decryption.

## Code Overview
- **Vigenere.java:** Contains the main logic for the GUI application, as well as the encryption and decryption algorithms.
  - `cifrarV` - Runnable thread that encrypts the input text using the Vigenere Cipher.
  - `decifrarV` - Runnable thread that decrypts the input text back to its original form using the same key.

- **MD5 Hashing**: A helper method (`getHashMd5`) generates an MD5 hash from a given string, used internally.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Acknowledgments
- FlatLaf for providing a modern, easy-to-integrate dark theme for Java Swing applications.
```
