package test;

import config.Persist;
import exceptions.InvalidPortNumberException;
import org.junit.jupiter.api.Test;

public class PersistTest {
    @Test
    public void test() throws InvalidPortNumberException
    {
        Persist persist = new Persist();
        persist.setPortNumber(1);
    }
}
