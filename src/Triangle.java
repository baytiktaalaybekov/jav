public class Triangle {
    int a;
    int b;
    int c;


 public void area(){
     double q= a+b+c;
     double w=q/2;
     double s =Math.sqrt(w*(w-a)*(w-b)*(w-c));

     System.out.println("Площажь треугольника "+s);


 }
}





