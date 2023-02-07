
// class Imaginary{
//     private float re = 0;
//     private float img = 0;

//     Imaginary(float re, float img){
//         this.re = re;
//         this.img = img;
//         System.out.println("The complex number you entered is :"+re+" + i"+img);
//     }

//     public String complex(){
//         return (re + "+ i" + img);
//     }

//     public void add(Imaginary num){
//         this.re += num.re;
//         this.img += num.img;
//     }
//     public void sub(Imaginary num){
//         this.re -= num.re;
//         this.img -= num.img;
//     }
//     public void multiply(Imaginary num){
//         float real = this.re;
//         float imagi = this.img;
//         this.re = real*num.re - imagi*num.img;
//         this.img = imagi*num.re + real*num.img;
//     }
//     public void divide(Imaginary num) throws Exception {
//         float real = (float) (((this.re*num.re)+(this.img*num.img))/(Math.pow(num.re,2)+Math.pow(num.img,2)));
//         float imagi = (float) (((this.img*num.re)-(this.re*num.img))/(Math.pow(num.re,2)+Math.pow(num.img,2)));
//         this.re = real;
//         this.img = imagi;
//     }
//     void 
// }

public class Complex {
    private float re = 0, im = 0;
    Complex(float re, float im) {
        this.re = re;
        this.im = im;
    }

    public String toString() {
        return (re + " + i" + im);
    }

    void add(Complex c2) {
        this.re = re + c2.re;
        this.im = im + c2.im;
    }
    
    void subs(Complex c3) {
        this.re = re - c3.re;
        this.im = im - c3.im;
    }

    void mul(Complex c4) {
        this.re = (re * c4.re) + -1*(im * c4.im);
        this.im = (re * c4.im) + (im * c4.re);
    }
    
    void div(Complex c5) throws Exception {
        if((c5.re == 0) && (c5.im == 0)) throw new Exception();
        this.re = ((re * c5.re) + (im * c5.im)) / ((c5.re * c5.re) + (c5.im * c5.im));
        this.im = (-1*(re * c5.im) + (im * c5.re)) / ((c5.re * c5.re) + (c5.im * c5.im));
    }
}
