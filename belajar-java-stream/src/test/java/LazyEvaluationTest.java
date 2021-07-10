import org.junit.Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LazyEvaluationTest {

    @Test
    public void testIntermediateOperations() {
        List<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khannedy");

        names.stream().map(name -> {
            System.out.println("Change " + name + "to Uppercase");
            return name.toUpperCase();
        });
    }

    @Test
    public void testTerminalOperations() {
        List<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khannedy");

        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + "to Uppercase");
                    return name.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Change " + upper + "to Mr.");
                    return "Mr. " + upper;
                })
                .forEach(System.out::println);
    }

    @Test
    public void testCurrency() {
        System.out.println(getCurrencyToRupiah("12345.98", true));
        System.out.println(getCurrencyToRupiahWithDec("12345.98", true));
    }

    public static String getCurrencyToRupiah(String crncy, boolean withRupiah) {
        if(crncy==null||crncy.equals("")) {
            return crncy;
        }
        Locale localeID = new Locale("in", "ID");
        crncy = crncy.split("\\.")[0];
        long number = Long.parseLong(crncy);

        NumberFormat format = NumberFormat.getCurrencyInstance(localeID);
        String data = format.format(number);
        //data = data.replace(",00", "");

        if(!withRupiah)
            data = data.replace("Rp", "");

        return data;
    }

    public static String getCurrencyToRupiahWithDec(String crncy, boolean withRupiah) {

        Locale localeID = new Locale("in", "ID");
        if(crncy==null||crncy.equals("")) {
            return crncy;
        }

        // assuming entry format "xxxxxxxx.yy"
        String[] splits = crncy.split("\\.");

        // parse the number, set default to 0 if empty
        long number = 0;
        if (null == splits[0] || splits[0].isEmpty()) {
            number = 0;
        } else {
            number = Long.parseLong(splits[0]);
        }

        // add the thousandth separator, and process the decimal
        NumberFormat format = NumberFormat.getCurrencyInstance(localeID);
        String data = format.format(number);
        if(splits.length>1) {
            data = data.split(",")[0]+","+splits[1];
        }else {
            data = data.split(",")[0]+",00";
        }

        if(!withRupiah)
            data = data.replace("Rp", "");

        return data;
    }
}
