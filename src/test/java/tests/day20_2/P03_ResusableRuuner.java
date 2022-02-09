package tests.day20_2;

import org.testng.annotations.Test;

public class P03_ResusableRuuner {

    @Test
    public void test01() {
        //ulkeler excelindeki sayfa 1 de
        // 11. indexdeki satirin 2. indexteki huceresinin Azerbaycan oldugunu test edin
        P99_ReusableMethodExcel p99=new P99_ReusableMethodExcel();
        String path="src/test/java/recources/ulkeler.xlsx";
        System.out.println(p99.hucreGetir(path, "Sayfa1", 3, 1).toString());
    }
}
