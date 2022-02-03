package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_SingeltonPattern {
    @Test
    public void test01(){
        //singelton pattern bir classtan birden fazla
        // obje uretilmesine izin vermeyen bir pattern olarak kabul gormustur

        //biz Driver classini driver uretmek uzere kullaniyoruz
        //ancak driver classinda driver isminde bir Instance veriable da var
        //ve biz obje ureterek bu instance drivera ulasabiliriz

       // Driver driver=new Driver();
        //singelton pattern kabul gormus bir patterndir
        //amac bir classtan obje uretilmemesini saglamaktır
        //bunun icin singelton pattern'de koruyacagimiz class'da
        //parametresiz bir constructor olusturur ve
        //bir constructor
    }
}
