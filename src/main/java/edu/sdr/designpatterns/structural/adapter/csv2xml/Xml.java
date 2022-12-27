package edu.sdr.designpatterns.structural.adapter.csv2xml;

public class Xml {

    private String line1;
    private String line2;
    private String line3;

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }

    @Override
    public String toString() {
        return "<xml>\n" +
                "   <line1>" + line1 + "</line1>\n" +
                "   <line2>" + line2 + "</line2>\n" +
                "   <line3>" + line3 + "</line3>\n" +
                "</xml>";
    }
}
