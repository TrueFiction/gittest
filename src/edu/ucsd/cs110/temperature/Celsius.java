package edu.ucsd.cs110.temperature;

import edu.ucsd.cs110.temperature.Temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
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
    	return super(super.getValue());
    }

    @Override
    public Temperature toFahrenheit(){
    	return Temperature((super.getValue() * 1.8) + 32);
    }
}
