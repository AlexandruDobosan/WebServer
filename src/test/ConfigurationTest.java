package test;

import config.Config;
import exceptions.InvalidPortNumberException;
import exceptions.LoadConfigFailException;
import exceptions.SaveConfigFailException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConfigurationTest {

    @Test
    public void testSetSetting()
    {
        Config conf = new Config("valid");
        assertTrue(conf.setSetting("PortNumber","8000"));
        assertTrue(conf.setSetting("RootDirectory","root"));
        assertTrue(conf.setSetting("MaintenanceDirectory","maintenance"));
    }

    @Test
    public void testGetSetting()
    {
        Config conf = new Config("valid");
        conf.setSetting("PortNumber","8000");
        conf.setSetting("RootDirectory","root");
        conf.setSetting("MaintenanceDirectory","maintenance");

        assertEquals("8000",conf.getSetting("PortNumber"));
        assertEquals("root",conf.getSetting("RootDirectory"));
        assertEquals("maintenance",conf.getSetting("MaintenanceDirectory"));

    }

    @Test
    public void testValidSaveConfigFile() throws SaveConfigFailException
    {
        Config conf = new Config("valid");
        conf.saveConfiguration();
    }

    @Test
    public void testInvalidSaveConfigFile() throws SaveConfigFailException
    {
        Config conf = new Config("invalid");
        conf.saveConfiguration();
    }

    @Test
    public void testValidLoadConfigFile() throws LoadConfigFailException
    {
        Config conf = new Config("valid");
        conf.loadConfiguration();
    }

    @Test
    public void testInvalidLoadConfigFile() throws LoadConfigFailException
    {
        Config conf = new Config("invalid");
        conf.loadConfiguration();
    }




    @Test
    public void testValidPortNumber() throws InvalidPortNumberException {
        Config conf = new Config("valid");
        assertTrue(conf.setPortNumber(8000));
    }

    @Test
    public void testInvalidPortNumber() throws InvalidPortNumberException {
        Config conf = new Config("valid");
        assertFalse(conf.setPortNumber(0));
    }

}
