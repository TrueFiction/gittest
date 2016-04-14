package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }



    public String toString()
    {
        // TODO: Complete this method
        return "";
    }

    @Override
    public Temperature toCelsius(){
    	return ((super.getValue() - 32)*(5/9));
    }

    @Override
    public Temperature toFahrenheit(){
    	return super.getValue();
    }
}

