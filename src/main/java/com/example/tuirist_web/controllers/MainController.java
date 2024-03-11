package com.example.tuirist_web.controllers;

import com.example.tuirist_web.models.*;
import com.example.tuirist_web.repositories.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private AddProgramsRepos addProgramsRepos;
    @Autowired
    private CityRepos cityRepos;
    @Autowired
    private CountryRepos countryRepos;
    @Autowired
    private HotelRepos hotelRepos;
    @Autowired
    private NumbersRepos numbersRepos;
    @Autowired
    private TypeMealsRepos typeMealsRepos;
    @Autowired
    private TypeNumbersRepos typeNumbersRepos;
    @Autowired
    private TypeSendingRepos typeSendingRepos;
    @Autowired
    private TypeVoucherRepos typeVoucherRepos;
    @Autowired
    private UserRepos userRepos;
    @Autowired
    private VoucherRepos voucherRepos;

    @GetMapping("/{model}")
    public String showall(Model model, @Valid @PathVariable("model") String models) {
        switch (models){
            case "addprograms":
                model.addAttribute("type", models);
                List<Add_Programs> addPrograms = addProgramsRepos.findAll();
                model.addAttribute("add_program", addPrograms);
                return "show";
            case "citys":
                model.addAttribute("type", models);
                List<City> cities = cityRepos.findAll();
                model.addAttribute("city", cities);
                return "show";
            case "countrys":
                model.addAttribute("type", models);
                List<Country> countries = countryRepos.findAll();
                model.addAttribute("county", countries);
                return "show";
            case "hotels":
                model.addAttribute("type", models);
                List<Hotel> hotels = hotelRepos.findAll();
                model.addAttribute("hotel", hotels);
                return "show";
            case "numbers":
                model.addAttribute("type", models);
                List<Numbers> numbers = numbersRepos.findAll();
                model.addAttribute("number", numbers);
                return "show";
            case "typemeals":
                model.addAttribute("type", models);
                List<Type_Meals> typeMeals = typeMealsRepos.findAll();
                model.addAttribute("typemeal", typeMeals);
                return "show";
            case "typenumbers":
                model.addAttribute("type", models);
                List<Type_Numbers> typeNumbers = typeNumbersRepos.findAll();
                model.addAttribute("typenumber", typeNumbers);
                return "show";
            case "typesendings":
                model.addAttribute("type", models);
                List<Type_Sending> typeSendings = typeSendingRepos.findAll();
                model.addAttribute("typesending", typeSendings);
                return "show";
            case "typevouchers":
                model.addAttribute("type", models);
                List<Type_Voucher> typeVouchers = typeVoucherRepos.findAll();
                model.addAttribute("typevoucher", typeVouchers);
                return "show";
            case "users":
                model.addAttribute("type", models);
                List<User> users = userRepos.findAll();
                model.addAttribute("user", users);
                return "show";
            case "vouchers":
                model.addAttribute("type", models);
                List<Voucher> vouchers = voucherRepos.findAll();
                model.addAttribute("voucher", vouchers);
                return "show";
        }
        return "index";
    }

    @GetMapping("/{model}/{id}")
    public String show(Model model, @Valid @PathVariable("id") long id, @Valid @PathVariable("model") String models) {
        switch (models){
            case "addprograms":
                model.addAttribute("type", models);
                Add_Programs addPrograms = addProgramsRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("add_program", addPrograms);
                return "showone";
            case "citys":
                model.addAttribute("type", models);
                City cities = cityRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("city", cities);
                return "showone";
            case "countrys":
                model.addAttribute("type", models);
                Country countries = countryRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("county", countries);
                return "showone";
            case "hotels":
                model.addAttribute("type", models);
                Hotel hotels = hotelRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("hotel", hotels);
                return "showone";
            case "numbers":
                model.addAttribute("type", models);
                Numbers numbers = numbersRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("number", numbers);
                return "showone";
            case "typemeals":
                model.addAttribute("type", models);
                Type_Meals typeMeals = typeMealsRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("typemeal", typeMeals);
                return "showone";
            case "typenumbers":
                model.addAttribute("type", models);
                Type_Numbers typeNumbers = typeNumbersRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("typenumber", typeNumbers);
                return "showone";
            case "typesendings":
                model.addAttribute("type", models);
                Type_Sending typeSendings = typeSendingRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("typesending", typeSendings);
                return "showone";
            case "typevouchers":
                model.addAttribute("type", models);
                Type_Voucher typeVouchers = typeVoucherRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("typevoucher", typeVouchers);
                return "showone";
            case "users":
                model.addAttribute("type", models);
                User users = userRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("user", users);
                return "showone";
            case "vouchers":
                model.addAttribute("type", models);
                Voucher vouchers = voucherRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("voucher", vouchers);
                return "showone";
        }
        return "index";
    }

    @GetMapping("/{model}/new")
    public String newing(Model model,@Valid  @PathVariable("model") String models, @ModelAttribute("newaddprogam") Add_Programs addPrograms, @ModelAttribute("newcity") City city, @ModelAttribute("newcountry") Country country, @ModelAttribute("newhotel") Hotel hotel, @ModelAttribute("newnumber") Numbers numbers, @ModelAttribute("newtypemeal") Type_Meals typeMeals, @ModelAttribute("newtypenumber") Type_Numbers typeNumbers, @ModelAttribute("newtypesending") Type_Sending typeSending, @ModelAttribute("newtypevoucher") Type_Voucher typeVoucher, @ModelAttribute("newuser") User user, @ModelAttribute("newvoucher") Voucher voucher) {
        model.addAttribute("type", models);
        List<Country> countries = countryRepos.findAll();
        model.addAttribute("county", countries);
        List<City> cities = cityRepos.findAll();
        model.addAttribute("city", cities);
        List<Type_Numbers> typeNumbers1 = typeNumbersRepos.findAll();
        model.addAttribute("typenumber", typeNumbers1);
        List<Hotel> hotels = hotelRepos.findAll();
        model.addAttribute("hotel", hotels);

        List<Add_Programs> add_programs = addProgramsRepos.findAll();
        model.addAttribute("add_program", add_programs);
        List<Numbers> numbers1 = numbersRepos.findAll();
        model.addAttribute("number", numbers1);
        List<Type_Sending> typeSendings = typeSendingRepos.findAll();
        model.addAttribute("typesending", typeSendings);
        List<Type_Voucher> typeVouchers = typeVoucherRepos.findAll();
        model.addAttribute("typevoucher", typeVouchers);
        return "new";
    }

    @PostMapping("/{model}/add")
    public String create(@Valid @PathVariable("model") String models, @ModelAttribute("newaddprogam") Add_Programs addPrograms, @ModelAttribute("newcity") City city, @ModelAttribute("newcountry") Country country, @ModelAttribute("newhotel") Hotel hotel, @ModelAttribute("newnumber") Numbers numbers, @ModelAttribute("newtypemeal") Type_Meals typeMeals, @ModelAttribute("newtypenumber") Type_Numbers typeNumbers, @ModelAttribute("newtypesending") Type_Sending typeSending, @ModelAttribute("newtypevoucher") Type_Voucher typeVoucher, @ModelAttribute("newuser") User user, @ModelAttribute("newvoucher") Voucher voucher) {
        switch (models){
            case "addprograms":
                addProgramsRepos.save(addPrograms);
                return "redirect:/"+models;
            case "citys":
                cityRepos.save(city);
                return "redirect:/"+models;
            case "countrys":
                countryRepos.save(country);
                return "redirect:/"+models;
            case "hotels":
                hotelRepos.save(hotel);
                return "redirect:/"+models;
            case "numbers":
                numbersRepos.save(numbers);
                return "redirect:/"+models;
            case "typemeals":
                typeMealsRepos.save(typeMeals);
                return "redirect:/"+models;
            case "typenumbers":
                typeNumbersRepos.save(typeNumbers);
                return "redirect:/"+models;
            case "typesendings":
                typeSendingRepos.save(typeSending);
                return "redirect:/"+models;
            case "typevouchers":
                typeVoucherRepos.save(typeVoucher);
                return "redirect:/"+models;
            case "users":
                userRepos.save(user);
                return "redirect:/"+models;
            case "vouchers":
                voucherRepos.save(voucher);
                return "redirect:/"+models;
        }
        return "redirect:/{model}";
    }

    @GetMapping("/{model}/{id}/edit")
    public String edit(Model model, @Valid @PathVariable("model") String models, @Valid @PathVariable("id") long id) {
        switch (models){
            case "addprograms":
                model.addAttribute("type", models);
                Add_Programs addPrograms = addProgramsRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid customer Id:" + id));
                model.addAttribute("add_program", addPrograms);
                return "edit";
            case "citys":
                model.addAttribute("type", models);
                List<Country> countryList = countryRepos.findAll();
                model.addAttribute("county", countryList);
                City cities = cityRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("city", cities);
                return "edit";
            case "countrys":
                model.addAttribute("type", models);
                Country countries = countryRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("county", countries);
                return "edit";
            case "hotels":
                model.addAttribute("type", models);
                List<City> cityList = cityRepos.findAll();
                model.addAttribute("city", cityList);
                Hotel hotels = hotelRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("hotel", hotels);
                return "edit";
            case "numbers":
                model.addAttribute("type", models);
                List<Type_Numbers> list = typeNumbersRepos.findAll();
                model.addAttribute("typenumber", list);
                List<Hotel> hotelList = hotelRepos.findAll();
                model.addAttribute("hotel", hotelList);
                Numbers numbers = numbersRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("number", numbers);
                return "edit";
            case "typemeals":
                model.addAttribute("type", models);
                Type_Meals typeMeals = typeMealsRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("typemeal", typeMeals);
                return "edit";
            case "typenumbers":
                model.addAttribute("type", models);
                Type_Numbers typeNumbers = typeNumbersRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("typenumber", typeNumbers);
                return "edit";
            case "typesendings":
                model.addAttribute("type", models);
                Type_Sending typeSendings = typeSendingRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("typesending", typeSendings);
                return "edit";
            case "typevouchers":
                model.addAttribute("type", models);
                Type_Voucher typeVouchers = typeVoucherRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("typevoucher", typeVouchers);
                return "edit";
            case "users":
                model.addAttribute("type", models);
                User users = userRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("user", users);
                return "edit";
            case "vouchers":
                model.addAttribute("type", models);
                List<Add_Programs> addProgramsList = addProgramsRepos.findAll();
                model.addAttribute("add_program", addProgramsList);
                List<Numbers> numbersList = numbersRepos.findAll();
                model.addAttribute("number", numbersList);
                List<Type_Sending> typeSendingList = typeSendingRepos.findAll();
                model.addAttribute("typesending", typeSendingList);
                List<Type_Voucher> typeVoucherList = typeVoucherRepos.findAll();
                model.addAttribute("typevoucher", typeVoucherList);
                Voucher vouchers = voucherRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                model.addAttribute("voucher", vouchers);
                return "edit";
        }
        return "index";
    }

    @PostMapping("/{model}/{id}/update")
    public String update(@Valid @PathVariable("model") String models, @Valid @PathVariable("id") int id, @ModelAttribute("updateaddprogam") Add_Programs addPrograms, @ModelAttribute("updatecity") City city, @ModelAttribute("updatecountry") Country country, @ModelAttribute("updatehotel") Hotel hotel, @ModelAttribute("updatenumber") Numbers numbers, @ModelAttribute("updatetypemeal") Type_Meals typeMeals, @ModelAttribute("updatetypenumber") Type_Numbers typeNumbers, @ModelAttribute("updatetypesending") Type_Sending typeSending, @ModelAttribute("updatetypevoucher") Type_Voucher typeVoucher, @ModelAttribute("updateuser") User user, @ModelAttribute("updatevoucher") Voucher voucher) {
        switch (models){
            case "addprograms":
                addPrograms.setId_add_programs(id);
                addProgramsRepos.save(addPrograms);
                return "redirect:/addprograms/"+id;
            case "citys":
                city.setId_city(id);
                cityRepos.save(city);
                return "redirect:/citys/"+id;
            case "countrys":
                country.setId_country(id);
                countryRepos.save(country);
                return "redirect:/countrys/"+id;
            case "hotels":
                hotel.setId_hotel(id);
                hotelRepos.save(hotel);
                return "redirect:/hotels/"+id;
            case "numbers":
                numbers.setId_numbers(id);
                numbersRepos.save(numbers);
                return "redirect:/numbers/"+id;
            case "typemeals":
                typeMeals.setId_Type_Meals(id);
                typeMealsRepos.save(typeMeals);
                return "redirect:/typemeals"+id;
            case "typenumbers":
                typeNumbers.setId_type_numbers(id);
                typeNumbersRepos.save(typeNumbers);
                return "redirect:/typenumbers/"+id;
            case "typesendings":
                typeSending.setId_type_sending(id);
                typeSendingRepos.save(typeSending);
                return "redirect:/typesendings/"+id;
            case "typevouchers":
                typeVoucher.setId_type_voucher(id);
                typeVoucherRepos.save(typeVoucher);
                return "redirect:/typevouchers/"+id;
            case "users":
                user.setId_user(id);
                userRepos.save(user);
                return "redirect:/users/"+id;
            case "vouchers":
                voucher.setId_voucher(id);
                voucherRepos.save(voucher);
                return "redirect:/vouchers/"+id;
        }
        return "redirect:/";
    }

    @PostMapping("/{model}/{id}/delete")
    public String delete(@Valid @PathVariable("model") String models, @Valid @PathVariable("id") long id) {
        switch (models){
            case "addprograms":
                Add_Programs addPrograms = addProgramsRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid customer Id:" + id));
                addProgramsRepos.delete(addPrograms);
                return "redirect:/"+models;
            case "citys":
                City cities = cityRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                cityRepos.delete(cities);
                return "redirect:/"+models;
            case "countrys":
                Country countries = countryRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                countryRepos.delete(countries);
                return "redirect:/"+models;
            case "hotels":
                Hotel hotels = hotelRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                hotelRepos.delete(hotels);
                return "redirect:/"+models;
            case "numbers":
                Numbers numbers = numbersRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                numbersRepos.delete(numbers);
                return "redirect:/"+models;
            case "typemeals":
                Type_Meals typeMeals = typeMealsRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                typeMealsRepos.delete(typeMeals);
                return "redirect:/"+models;
            case "typenumbers":
                Type_Numbers typeNumbers = typeNumbersRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                typeNumbersRepos.delete(typeNumbers);
                return "redirect:/"+models;
            case "typesendings":
                Type_Sending typeSendings = typeSendingRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                typeSendingRepos.delete(typeSendings);
                return "redirect:/"+models;
            case "typevouchers":
                Type_Voucher typeVouchers = typeVoucherRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                typeVoucherRepos.delete(typeVouchers);
                return "redirect:/"+models;
            case "users":
                User users = userRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                userRepos.delete(users);
                return "redirect:/"+models;
            case "vouchers":
                Voucher vouchers = voucherRepos.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
                voucherRepos.delete(vouchers);
                return "redirect:/"+models;
        }
        return "redirect:/";
    }
}
