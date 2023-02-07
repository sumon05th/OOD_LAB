
public class Hello {
    public static void main(String arg[]) {
        Complex c = new Complex(10,5);
        Complex c1 = new Complex(0,0);
        try {
            c.div(c1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(c);
    }
}












































// public class lab1{
//     public static void main(String[] args) {
//         Imaginary obj1 = new Imaginary(4.2f, 5f);
//         Imaginary obj2 = new Imaginary(3f, 4f);
//         obj1.add(obj2);
//         System.out.println("Adding 4+5i and 2+3i is "+ obj1.complex()+"\n");
//         obj1.sub(obj2);
//         System.out.println("Subtracting 4+5i and 2+3i is "+ obj1.complex()+"\n");
//         obj1.multiply(obj2);
//         System.out.println("Multiplying 4+5i and 2+3i is "+ obj1.complex()+"\n");
//         // obj1.divide(obj2);
//          try{
//             obj1.divide(obj2);
//         }catch(Exception e){
//             e.printStackTrace();

//         }
//         System.out.println("Dividing 4+5i and 2+3i is "+ obj1.complex()+"\n");
       
        
//     }
// }