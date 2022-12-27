package edu.sdr.designpatterns.structural.adapter.csv2xml;

import java.util.List;

public class Csv {

    private List<String> list;
    // where String value1, value2, value3, ....

    /**
     *
     * private List<List<String>> list;
     * private List<String[]> list;
     *
     */


    public Csv(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
