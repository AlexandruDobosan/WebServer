package config;

import exceptions.InvalidPortNumberException;
import exceptions.LoadConfigFailException;
import exceptions.SaveConfigFailException;

public class Config {
    private String configurationFileName = null;

    public Config(String configurationFileName)
    {
        this.configurationFileName = configurationFileName;
    }

    public void loadConfiguration() throws LoadConfigFailException
    {}

    public void saveConfiguration() throws SaveConfigFailException
    {}

    public String getSetting(String key)
    {
        return null;
    }

    public boolean setSetting(String key,String name)
    {
        return false;
    }


    public boolean setPortNumber(int i) throws InvalidPortNumberException {
        return false;
    }
}
