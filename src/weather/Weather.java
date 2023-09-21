package weather;

public class Weather
{
    public String evaluateWeather(double temperature)
    {
        String responce;
        if (temperature >= 22.0)
        {
            responce = "Heute ist ein schöner Tag!";
        }
        else
        {
            responce = "Heute ist nicht so schön..";
        }
        return responce;
    }

}
