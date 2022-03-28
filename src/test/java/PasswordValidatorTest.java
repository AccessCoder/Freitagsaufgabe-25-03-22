import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void isPasswordLong_pwEquals6(){
        assertFalse(PasswordValidator.hasValidLength("Shorty"));
    }
    @Test
    void isPasswordLong_pwEquals7(){
        assertFalse(PasswordValidator.hasValidLength("Shorty1"));
    }
    @Test
    void isPasswordLong_pwEquals8(){
        assertTrue(PasswordValidator.hasValidLength("Shorty11"));
    }

    @Test
    void containsDigit_withDigit(){
        assertTrue(PasswordValidator.hasNums("Shorty11"));
    }

    @Test
    void containsDigit_withoutDigit(){
        assertFalse(PasswordValidator.hasNums("ShortyIsCool"));
    }

    @Test
    void isUpperCase(){
        assertTrue(PasswordValidator.checkUpperCase("Shorty11"));//shorty11
    }

    @Test
    void isLowerCase(){
        assertTrue(PasswordValidator.containsLowerCase("Shorty11"));//SHORTY11
    }

    @Test
    void isAllowed_pwShorty(){
        assertTrue(PasswordValidator.isAllowed("Shorty11"));
    }

    @Test
    void isAllowed_pwNotSafe(){
        assertFalse(PasswordValidator.isAllowed("Passwort123!"));
    }

}