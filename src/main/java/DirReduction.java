/**
 *
 * Aca esta el problema
 * https://www.codewars.com/kata/550f22f4d758534c1100025a/train/java
 *
 */
public class DirReduction {

    public static String[] dirReduction(String [] arr) {

        if (arr.length == 1) {

            return arr;

        }


        for  (int i = 1; i < arr.length ; i++) {



            if (comprobarOpuestosCaminos(arr[i-1],arr[i])){

                arr=quitarElementoCadena(arr, i);
                arr=quitarElementoCadena(arr, i);
                i--;
            }
        }

        return arr;

    }

    public static String [] quitarElementoCadena  (String [] arr,
                                                   int index ){

        if (arr == null){

            return arr;

        }

        String [] cadenArrModificada = new String [arr.length-2];
        System.arraycopy(arr,0,cadenArrModificada,0,index);
        System.arraycopy(arr,index+1,
                         cadenArrModificada,index,arr.length-index-1);

        return cadenArrModificada;

    }

    public static boolean comprobarOpuestosCaminos(String a ,
                                                   String b) {
        String unirAB;
        unirAB=a.concat(b);
        boolean sw=false;
        switch (unirAB){
            case "NORTHSOUTH":
                sw=true;
                break;
            case "SOUTHNORTH":
                sw=true;
                break;
            case "EASTWEST":
                sw=true;
                break;
            case "WESTEAST":
                sw=true;
                break;
        }
        return sw;
    }
}
