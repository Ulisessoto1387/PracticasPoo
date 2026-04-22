public class Arreglo {

    public int sumaArreglo(int[] arr) {
        int suma = 0;
        
        try{
            for (int i = 0; i < arr.length; i++) {
                suma = suma + arr[i];
            }
        }
        
        catch(ArrayIndexOutOfBoundsException objeto){
            System.out.println("Ocurrrio un error");
            System.out.println("Corrigiendo");
        }
        return suma;
    }
    
}

