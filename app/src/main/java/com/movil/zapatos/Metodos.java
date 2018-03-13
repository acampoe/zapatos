package com.movil.zapatos;

/**
 * Created by android on 12/03/2018.
 */

public class Metodos {
    public static double Calcular(int idGenero, int idMarca, int idEstilo, double cantidad){
        double precio = 0;
        double total = 0;
        switch (idGenero){
            case 0: //hombre
                switch (idEstilo){
                    case 0: //clasico
                        switch (idMarca){
                            case 0: //nike
                                precio = 50000;
                                break;
                            case 1: //adidas
                                precio = 80000;
                                break;
                            case 2: //puma
                                precio = 100000;
                                break;
                        }
                        break;
                    case 1: //zapatilla
                        switch (idMarca){
                            case 0: //nike
                                precio = 120000;
                                break;
                            case 1: //adidas
                                precio = 140000;
                                break;
                            case 2: // puma
                                precio = 130000;
                                break;
                        }
                        break;
                }
                break;
            case 1:
                switch (idEstilo){
                    case 0:
                        switch (idMarca){
                            case 0:
                                precio = 60000;
                                break;
                            case 1:
                                precio = 70000;
                                break;
                            case 2:
                                precio = 120000;
                                break;
                        }
                        break;
                    case 1:
                        switch (idMarca){
                            case 0:
                                precio = 100000;
                                break;
                            case 1:
                                precio = 130000;
                                break;
                            case 2:
                                precio = 110000;
                                break;
                        }
                        break;
                }
                break;
        }
        total = precio * cantidad;

        return total;
    }
}
