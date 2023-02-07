class Imaginary{
    private float re = 0;
    private float img = 0;

    Imaginary(float re, float img){
        this.re = re;
        this.img = img;
        System.out.println("The complex number you entered is :"+re+" + i"+img);
    }

    public String complex(){
        return (re + "+ i" + img);
    }

    public void add(Imaginary num){
        this.re += num.re;
        this.img += num.img;
    }
    public void sub(Imaginary num){
        this.re -= num.re;
        this.img -= num.img;
    }
    public void multiply(Imaginary num){
        float real = this.re;
        float imagi = this.img;
        this.re = real*num.re - imagi*num.img;
        this.img = imagi*num.re + real*num.img;
    }
    public void divide(Imaginary num){
        float real = (float) (((this.re*num.re)+(this.img*num.img))/(Math.pow(num.re,2)+Math.pow(num.img,2)));
        float imagi = (float) (((this.img*num.re)-(this.re*num.img))/(Math.pow(num.re,2)+Math.pow(num.img,2)));
        this.re = real;
        this.img = imagi;
    }
}

public class lab1{
    public static void main(String[] args) {
        Imaginary obj1 = new Imaginary(4.2f, 5f);
        Imaginary obj2 = new Imaginary(3f, 4f);
        obj1.add(obj2);
        System.out.println("Adding 4+5i and 2+3i is "+ obj1.complex()+"\n");
        obj1.sub(obj2);
        System.out.println("Subtracting 4+5i and 2+3i is "+ obj1.complex()+"\n");
        obj1.multiply(obj2);
        System.out.println("Multiplying 4+5i and 2+3i is "+ obj1.complex()+"\n");
        obj1.divide(obj2);
        System.out.println("Dividing 4+5i and 2+3i is "+ obj1.complex()+"\n");

    }
}