package com.example.examen;


 public class Practicos {
    /*
    Implementar un algoritmo reciba un array y muestre su contenido
    • Vector ejemplo int []v ={6,3,5,1,8,7,2,4};
    • Firma: public String mostrarv(int []v);
    • Resultado esperado: 6 - 3 – 5 – 1 – 8 – 7 – 2 – 4
    */

    static public String mostrarv(int []v){
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < v.length; i++) {
            r.append(v[i]);
            if(i != v.length - 1){
                r.append(" - ");
            }
        }
        return r.toString();
    }
}
