package com.designpatterns.structural.adapter.csv2xml;

public class CsvXmlAdaptor {

    public Xml convert(Csv csv) {
        Xml xml = new Xml();

        xml.setLine1(csv.getList().get(0));
        xml.setLine2(csv.getList().get(1));
        xml.setLine3(csv.getList().get(2));

        return xml;
    }

}
