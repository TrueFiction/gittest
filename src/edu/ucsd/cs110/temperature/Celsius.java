package edu.ucsd.cs110.temperature;

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
    	return super.getValue();
    }

    @Override
    public Temperature toFahrenheit(){
    	return ((super.getValue() * 1.8) + 32);
    }
}
