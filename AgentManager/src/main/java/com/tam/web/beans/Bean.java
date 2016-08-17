package com.tam.web.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="bean")
@ViewScoped
public class Bean {
	private List<String> items;
	

    @PostConstruct
    public void init() {
        items = new ArrayList<String>();
        items.add("");
       
    }

    public void add() {
        items.add(new String());
    }

    public void remove(String item) {
        items.remove(item);
    }

    public void save() {
        System.out.println("items: " + items);
    }

    public List<String> getItems() {
        return items;
    }
}