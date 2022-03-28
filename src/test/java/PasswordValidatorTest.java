import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void isPasswordLong_pwEquals6(){
        assertFalse(PasswordValidator.isLongerThan7("Shorty"));
    }
    @Test
    void isPasswordLong_pwEquals7(){
        assertFalse(PasswordValidator.isLongerThan7("Shorty1"));
    }
    @Test
    void isPasswordLong_pwEquals8(){
        assertTrue(PasswordValidator.isLongerThan7("Shorty11"));
    }

    @Test
    void containsDigit_withDigit(){
        assertTrue(PasswordValidator.checkNums("Shorty11"));
    }

    @Test
    void containsDigit_withoutDigit(){
        assertFalse(PasswordValidator.checkNums("ShortyIsCool"));
    }

    @Test
    void isUpperCase(){
        assertTrue(PasswordValidator.checkUpperCase("Shorty11"));//shorty11
    }

    @Test
    void isLowerCase(){
        assertTrue(PasswordValidator.checkLowerCase("Shorty11"));//SHORTY11
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