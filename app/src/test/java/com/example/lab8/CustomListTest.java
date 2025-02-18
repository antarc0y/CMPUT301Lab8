package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


//import org.junit.Before;
import android.content.Context;
import android.view.View;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList() {
        CustomList list = new CustomList(null,new ArrayList<>());
        return list;
    }
    @Test
    public void testAdd() {
        CustomList mockList = MockCityList();
        int size = mockList.getCount();
        mockList.addCity(new City("Edmonton","Alberta"));
        assertEquals(mockList.getCount(),size+1);
    }

    @Test
    public void testHasCity() {
        CustomList list = MockCityList();
        City city = new City("Victoria", "BC");
        list.addCity(city);
        assertEquals(true,list.hasCity(city));
    }

    @Test
    void testDelete() throws Exception {
        CustomList list = MockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        City city2 = new City("Ottawa", "Toronto");
        list.addCity(city);
        list.delete(city);
        assertEquals(false,list.hasCity(city));
        assertThrows(Exception.class, ()-> list.delete(city2));
    }

    @Test
    void testCountCity() {
        CustomList list = MockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        City city2 = new City("Ottawa", "Toronto");
        list.addCity(city);
        list.addCity(city2);
        assertEquals(2,list.countCities());
    }


}
