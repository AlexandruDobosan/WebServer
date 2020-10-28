package config;

import exceptions.InvalidPortNumberException;
import validators.PortNumberValidator;

public class Persist {
    public int getPortNumber()
    {
        return 0;
    }

    public String getRootDir()
    {
        return null;
    }

    public String getMaintenanceDir()
    {
        return null;
    }

    public boolean setPortNumber(int portNumber) throws InvalidPortNumberException
    {
       if(!PortNumberValidator.validate(portNumber))
        return false;
       return true;
    }

    public void setRootDir(String rootDir)
    {
    }

    public void setMaintenanceDir(String maintenanceDir)
    {
    }
}
