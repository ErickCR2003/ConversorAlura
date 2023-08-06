package modelo;

public class SolesAMonedas {
    /*
        USD $ - Dólar estadounidense
        EUR € - Euro
        JPY ¥ - Yen japonés
        GBP £ - Libra esterlina
        CNY ¥ - Yuan chino
        PEN S/. - Nuevo sol peruano
        MXN $ - Peso mexicano
    */

    public static double ConvertirSolesADolares(double valor) {
        double monedaDolar = valor * 0.27;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        return monedaDolar;
    }

    public static double ConvertirSolesAEuros(double valor) {
        double monedaEuro = valor * 0.25;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        return monedaEuro;

    }
    
    public static double ConvertirSolesAYen(double valor) {
        double monedaYen = valor * 38.27;
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        return monedaYen;

    }

    public static double ConvertirSolesALibras(double valor) {
        double monedaLibra = valor * 0.21;
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        return monedaLibra;

    }

    public static double ConvertirSolesAYuan(double valor) {
        double monedaWon = valor * 1.94;
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        return monedaWon;

    }
    
    public static double ConvertirSolesAMexicano(double valor) {
        double monedaWon = valor * 4.60;
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        return monedaWon;

    }

}
