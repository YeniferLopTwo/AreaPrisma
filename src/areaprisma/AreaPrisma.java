package areaprisma;

import java.util.Scanner;

class Prisma {

    private int baseTriangulo;
    private int alturaPrisma;

    public Prisma(int base, int altura) {
        this.baseTriangulo = base;
        this.alturaPrisma = altura;
    }

    public int getBaseTriangulo() {
        return this.baseTriangulo;
    }

    public int getAlturaPrisma() {
        return this.alturaPrisma;
    }

    public void setAlturaPrisma(int altura) {
        this.alturaPrisma = altura;
    }

    public void setBaseTriangulo(int base) {
        this.baseTriangulo = base;
    }

    public float alturaTriangulo() {
        return (float) Math.sqrt(3) / 2 * this.baseTriangulo;
    }

    public float areaBase() {
        return (this.baseTriangulo * alturaTriangulo()) / 2;
    }

    public float perimetro() {
        return (2 * 3 * this.baseTriangulo + 3 * this.alturaPrisma);
    }

    public float areaLateral() {
        return this.baseTriangulo * this.alturaPrisma;
    }

    public float areaTotal() {
        return 3 * areaLateral() + 2 * areaBase();
    }
}

public class AreaPrisma {

    public static boolean isNumeric(String valor) {
        return valor.matches("[-+]?\\d*\\.?\\d+");
    }

    public static float leerValor() {
        Scanner teclado = new Scanner(System.in);
        String valor;
        do {
            valor = teclado.next();
        } while (!isNumeric(valor));

        return Float.parseFloat(valor);
    }

    public static void imprimirValor(String valor) {
        System.out.println(Float.parseFloat(valor));
    }

    public static float alturaTriangulo(float baseTriangulo) {
        return (float) Math.sqrt(3) / 2 * baseTriangulo;
    }

    public static float areaBase(float baseTriangulo, float alturaTriangulo) {
        return (baseTriangulo * alturaTriangulo) / 2;
    }

    public static float perimetro(float baseTriangulo) {
        return (3 * baseTriangulo);
    }

    public static float areaLateral(float perimetro, float alturaPrisma) {
        return (perimetro * alturaPrisma);
    }

    public static float areaTotal(float areaBase, float areaLateral) {
        return 2 * areaBase + areaLateral;
    }

    public static void main(String[] args) {
        /*System.out.println("Introduce la base del triángulo");
        float base=leerValor();
        System.out.println("Introduce la altura del prisma");
        float alturaPrisma=leerValor();
        System.out.println("Área total: " + areaTotal(areaBase(base,alturaTriangulo(base)), areaLateral(perimetro(base),alturaPrisma)));*/

        Scanner teclado = new Scanner(System.in);

        /*String valor = "";
        do {
            System.out.println("Introduce la base del triangulo");
            valor = teclado.next();
        } while (!isNumeric(valor));
        int base = Integer.parseInt(valor);

        valor = "";
        do {
            System.out.println("Introduce la altura del prisma");
            valor = teclado.next();
        } while (!isNumeric(valor));
        int alturaPrisma = Integer.parseInt(valor);*/
        
        int base = (int) (Math.random()*10+1);
        int alturaPrisma = (int) (Math.random()*10+1);
        

        Prisma prisma1 = new Prisma(base, alturaPrisma);

        System.out.println("Base: " + prisma1.getBaseTriangulo());
        System.out.println("Altura: " + prisma1.getAlturaPrisma());
        System.out.println("Area total: " + prisma1.areaTotal());

        int base2 = (int) (Math.random()*10+1);
        int alturaPrisma2 = (int) (Math.random()*10+1);
        
        Prisma prisma2 = new Prisma(base2, alturaPrisma2);

        System.out.println("Base: " + prisma2.getBaseTriangulo());
        System.out.println("Altura: " + prisma2.getAlturaPrisma());
        System.out.println("Area total: " + prisma2.areaTotal());

        int base3 = (int) (Math.random()*10+1);
        int alturaPrisma3 = (int) (Math.random()*10+1);
        
        Prisma prisma3 = new Prisma(base3, alturaPrisma3);

        System.out.println("Base: " + prisma3.getBaseTriangulo());
        System.out.println("Altura: " + prisma3.getAlturaPrisma());
        System.out.println("Area total: " + prisma3.areaTotal());

        System.out.println("Ordenados de mayor a menor:");
        
        if (prisma1.areaTotal() >= prisma2.areaTotal() && prisma1.areaTotal() >= prisma3.areaTotal()) {
            if (prisma2.areaTotal() >= prisma3.areaTotal()) {
                System.out.println("El más grande es 1, luego el 2 y ultimo el 3");
            } else {
                System.out.println("El más grande es 1, luego el 3 y ultimo el 2");
            }
        }
        
        if (prisma2.areaTotal() >= prisma1.areaTotal() && prisma2.areaTotal() >= prisma3.areaTotal()) {
            if (prisma1.areaTotal() >= prisma3.areaTotal()) {
                System.out.println("El más grande es 2, luego el 1 y ultimo el 3");
            } else {
                System.out.println("El más grande es 2, luego el 3 y ultimo el 1");
            }
        }
        
        if (prisma3.areaTotal() >= prisma1.areaTotal() && prisma3.areaTotal() >= prisma2.areaTotal()) {
            if (prisma1.areaTotal() >= prisma2.areaTotal()) {
                System.out.println("El más grande es 3, luego el 1 y ultimo el 2");
            } else {
                System.out.println("El más grande es 3, luego el 2 y ultimo el 1");
            }
        }

    }

}
