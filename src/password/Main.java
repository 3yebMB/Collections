package password;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String pass1 = "Ab2!G#1k#";
        final String pass2 = "Abc!fG#lk";
        final String pass3 = "AAAAAAAA";
        final String pass4 = "aaaaaaaa";
        final String pass5 = "        ";
        final String pass6 = "AaaaaaaA";
        final String pass7 = "kZ@~1QqP+";
        final String pass8 = "$sApDr0W!";

        System.out.println("Пароль " + pass1 + ((checkPass(pass1))?(" валидный"):(" не валиден.")));
        System.out.println("Пароль " + pass2 + ((checkPass(pass2))?(" валидный"):(" не валиден.")));
        System.out.println("Пароль " + pass3 + ((checkPass(pass3))?(" валидный"):(" не валиден.")));
        System.out.println("Пароль " + pass4 + ((checkPass(pass4))?(" валидный"):(" не валиден.")));
        System.out.println("Пароль " + pass5 + ((checkPass(pass5))?(" валидный"):(" не валиден.")));
        System.out.println("Пароль " + pass6 + ((checkPass(pass6))?(" валидный"):(" не валиден.")));
        System.out.println("Пароль " + pass7 + ((checkPass(pass7))?(" валидный"):(" не валиден.")));
        System.out.println("Пароль " + pass8 + ((checkPass(pass8))?(" валидный"):(" не валиден.")));
    }

    public static boolean checkPass(String pass){
        Pattern p = Pattern.compile("^(?=.+[A-Z])(?=.+[a-z])(?=.+[0-9])(?=.+[+/#?!@$~%^&*-])([\\S]){8,}$");
        Matcher m = p.matcher(pass);
        return m.matches();
    }
}
