package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import android.content.Context;
import android.view.View;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomListTest {
    public CustomList mockCity() {
        CustomList list = new CustomList(null,new ArrayList<>());
        return list;
    }
    @Test
    public void testAdd() {
        CustomList mockList = mockCity();
        int size = mockList.getCount();
        mockList.addCity(new City("Edmonton","Alberta"));
        assertEquals(mockList.getCount(),size+1);
    }
}
