/*
 Diseñe un algoritmo que le permita: 
1).Desplegar el nombre del proyecto de su paper.
2).Que es una red neuronal.
3).Cuales son los elementos que forman una red neuronal.
4).Como utilizaron la red neuronal en el proyecto que usted haya seleccionado.
5).Como utilizaria usted la red neurronal como mejoramiento del proyecto propuesto.
6).En que consistio el entrenamiento utilizando la red neuronal, indique el algoritmo utilizado.
 */
package redneuronal1;

/**
 *
 * @author William Hernan Taco Taco
 */
import java.util.Scanner;
public class RedNeuronal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
        
        System.out.println("Ingrese el numero 1: Nombre del Proyecto del Paper");
        String paper=objeto.nextLine();
        
        System.out.println(paper+") DETERMINACIÓN DE LA PRESIÓN MÁXIMA DE COMPRESIÓN DE UN MOTOR DE ENCENDIDO\n"
                + "   PROVOCADO BASADO EN UNA RED NEURONAL ARTIFICIAL RECURRENTE");
        
        System.out.println("Ingrese el numero 2: ¿Que es una red neuronal?");
        String redNeuronal=objeto.nextLine();
        
        System.out.println(redNeuronal+") Una red neuronal es una tecnica considerada de gran contribución en analisis\n"
                + "   de los parametros de motor de combustion interna, segun expresa Saraswati y Chand");
        
        System.out.println("Ingrese el numero 3: Cuales son los elementos que forman una red neuronal");
        String elementos=objeto.nextLine();
        
        System.out.println(elementos+") - La instrumentación del motor\n"
                + "   - El diseño del software\n"
                + "   - La toma de datos\n"
                + "   - La validación de las muestras\n"
                + "   - La creación y entrenamiento de una red neuronal artificial");
        
        System.out.println("Ingrese el numero 4: Como utilizaron la red neuronal en el proyecto que usted haya seleccionado.");
        String usar=objeto.nextLine();
        
        System.out.println(usar+") Se aplica una red neuronal tipo Elman, esto basado\n" 
                +"    en una corrida pre experimental en la cual se realizaron\n" 
                +"    entrenamientos con diferentes tipos de redes como\n" 
                +"    feed-forward, cascade-forward, elman-forward,\n" 
                +"    de las cuales se escoge la que menor error obtiene,\n" 
                +"    para un mejor tipo de diagnostico");
        
        System.out.println("Ingrese el numero 5: Como utilizaria usted la red neurronal como mejoramiento del proyecto propuesto");
        String mejoramiento=objeto.nextLine();
        
        System.out.println(mejoramiento+") Para optimizar y desarrollar mediante las redes neuronales\n"
                + "   artificailes dentro de un sistema de diagnostico automatizado de los fallos de encendido\n"
                + "   en los motores de combustion interna que constaria de tres etapas: detección,\n"
                + "   localización e identifiacación de gravedad de fallos.");
        
        System.out.println("Ingrese el numero 6: En que consistio el entrenamiento utilizando la red neuronal, indique el algoritmo utilizado.");
        String entrenamiento=objeto.nextLine();
        
        System.out.println(entrenamiento+") Se aplico el entrenamiento de la red que se realizo en función\n"
                + "   de Levenberg-Marqueardt, cuyo algoritmo fue:\n"
                + "   - Aplicar 3 capas cada una con 15,10 y 5 neuronas por capa\n"
                + "   - Funcion de activacion entre la neurona deentrada y la primera de tipo Logsig\n"
                + "   - Seguida de dos capas en funcion de Elliotsig\n"
                + "   - Por ultimo entre la y la neurona de salida una funcion de tipo Purelin ");
     
    }
    
}
