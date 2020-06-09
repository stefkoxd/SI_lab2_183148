import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    public final SILab2 example = new SILab2();

    @Test
    void everyBranch() {
        //T1
        assertTrue(example.function(new User("test", "P@ssw0rd1", "email@email.com"), null));
        //T2
        assertFalse(example.function(null, null));
        //T3
        assertFalse(example.function(new User(null, "P@ssw0rd1", "email@email.com"), null));
        //T4
        assertFalse(example.function(new User("test", "P@ssw0rd1test", "email@email.com"), null));
        //T5
        assertFalse(example.function(new User("test", "Password1", "email@email.com"), null));
    }

    @Test
    void everyStatement(){
        //T1
        assertTrue(example.function(new User("test", "P@ssw0rd1", "email@email.com"), null));
        //T2
        assertFalse(example.function(null, null));
    }

}