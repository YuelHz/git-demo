package com.yuel.springbootrestful.dao;


import com.yuel.springbootrestful.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class GuestDao {
    static List<Guest> guestList = new ArrayList<>();
    static {
        guestList.add(new Guest("张三","董事长"));
        guestList.add(new Guest("李四","副董事长"));
        guestList.add(new Guest("王五","总经理"));
        guestList.add(new Guest("王二","副经理"));
        guestList.add(new Guest("麻子","店长"));
        guestList.add(new Guest("钱五","副店长"));
    }
    public List<Guest> getlist(){
        return guestList;
    }
    public void add(Guest guest){
        guestList.add(guest);
    }

    public void update(Guest newGuest){
        Guest oldguest = get(newGuest.getName());
        oldguest.setRole(newGuest.getRole());
    }
    public Guest get(String name){
        for (Guest guest:guestList){
            if (guest.getName().equals(name)){
                return guest;
            }
        }
        return new Guest("","");
    }
    public void delete(String name){
        guestList.remove(get(name));
    }
}
