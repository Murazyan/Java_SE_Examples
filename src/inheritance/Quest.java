package inheritance;

import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Quest {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String msg = "barev Maga jan";
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(msg.getBytes());
        System.out.println(msg);
        byte[] digest = messageDigest.digest();
        System.out.println(new String(digest));

        //Converting the byte array in to HexString format
        StringBuffer hexString = new StringBuffer();

        for (int i = 0;i<digest.length;i++) {
            hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        System.out.println("Hex format : " + hexString.toString());


        KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        //Creating a SecureRandom object
        SecureRandom secRandom = new SecureRandom();
        //Initializing the KeyGenerator
        keyGen.init(secRandom);
        //Creating/Generating a key
//        Key key = keyGen.generateKey();
//        //Initializing the Mac object
//        mac.init(key);



    }
} 