package edu.sdr.design_patterns.structural.adapter.csv2xml;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String... arg) {

        // create the CSV file
        List<String> list = new LinkedList<>();
        list.add("l1,a11,a12,a13");
        list.add("l2,a21,a22,a23");
        list.add("l3,a31,a32,a33");
        Csv csv = new Csv(list);

        //create adaptor
        CsvXmlAdaptor csvXmlAdaptor = new CsvXmlAdaptor();

        Xml xml =  csvXmlAdaptor.convert(csv);

        System.out.println(xml);

        /**
         * 1. to export JSON
         * 2. combinatii diferite intre intrare si iesire
         *
         * 3. parser de CSV
         *
         * 4. adaugati exemple!!!! culori, conversii de numere (cifre romana <-> arabe ),
         *
         */


        //int varcccc = calculate2();

//        int var1 = calculate();
//        int var2 = calculate(1);
//        int var3 = calculate(1, 2, 3, 4);
//
//        System.out.println(var1);
//        System.out.println(var2);
//        System.out.println(var3);
    }

    //private static int calculate2(Integer[] args) {
    private static int calculate(Integer... args) {
        if(args == null || args.length == 0){
            return 0;
        } else {
            int sum  = 0;
            for(Integer element : args) {
                sum += element;
            }
            return sum;
        }
    }

}
