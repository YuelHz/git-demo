package com.yuel.springbootrestful.controller;



import com.yuel.springbootrestful.bean.Guest;
import com.yuel.springbootrestful.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 业务控制类  返回视图
 */
@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

//    @RequestMapping("/guest/list")
    @GetMapping
    public String list(Model model) {
        List<Guest> guests =  guestService.list();
        model.addAttribute("guests",guests);
        return "list";
    }

//    @RequestMapping("/guest/toAdd")
    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

//    @RequestMapping("/guest/add")
    @PostMapping("")
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest";
    }

    /**
     * 通过/toUpdate/{name}格式的url映射到此方法
     * 其中的name的属性值  通过注解@PathVariable("name")映射到方法的属性中
     * 其中的“name” 代表去url中查找的属性值
     *
     * @param model
     * @param name
     * @return
     */
//    @RequestMapping("/guest/toUpdate")
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name ){
        Guest guest = guestService.get(name);
        model.addAttribute("guest",guest);
        return "update";
    }

//    @RequestMapping("/guest/update")
    @PutMapping
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest";
    }
//    @RequestMapping("/guest/delete")
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        guestService.delete(name);
        return "redirect:/guest";
    }
}
