package com.xml.adapter;


import com.xml.entity.Shop;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter extends XmlAdapter<String, Date> {

    private String pattern = "yyyy-MM-dd HH";
    SimpleDateFormat format = new SimpleDateFormat(pattern);

    public DateAdapter() {
        super();
    }


    /**
     * 将String转为Date
     * */
    @Override
    public Date unmarshal(String v) throws Exception {
        return format.parse(v);
    }

    /**
     *将Date转为String
     * */
    @Override
    public String marshal(Date v) throws Exception {
        return format.format(v);
    }
}
