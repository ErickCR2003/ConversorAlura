package modelo;

public class Temperatura {

    public static double ConvertirCelciusAFarenheit(double valor) {
        double farenheit = valor * 1.8 + 32;
        farenheit = (double) Math.round(farenheit * 100d) / 100;
        return farenheit;
    }

    public static double ConvertirCelciusAKelvin(double valor) {
        double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        return kelvin;
       
    }

    public static double ConvertirFarenheitACelcius(double valor) {
        double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius * 100d) / 100;
        return celcius;
    }
    
    public static double ConvertirFarenheitAKelvin(double valor) {
        double kelvin = (valor + 459.67) * 0.55556;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        return kelvin;
    }

    public static double ConvertirKelvinACelcius(double valor) {
        double kelvinCelcius = valor - 273.15;
        kelvinCelcius = (double) Math.round(kelvinCelcius * 100d) / 100;
        return kelvinCelcius;
    }

    public static double ConvertirKelvinAFarenheit(double valor) {
        double kelvinFarenheit = ConvertirKelvinACelcius(valor);
        kelvinFarenheit = ConvertirCelciusAFarenheit(kelvinFarenheit);
        kelvinFarenheit = (double) Math.round(kelvinFarenheit * 100d) / 100;
        return kelvinFarenheit;
    }
}
