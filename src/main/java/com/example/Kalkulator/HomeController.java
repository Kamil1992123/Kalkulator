package com.example.Kalkulator;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller

public class HomeController {

@GetMapping("/")
    public String home(){
        return "home";}


        @GetMapping("/result")
    public String result(@RequestParam int firstNumber, @RequestParam int secondNumber, @RequestParam String operation,

                         ModelMap map){
            Calculator calculator = new Calculator(firstNumber, secondNumber, operation);
        if ( operation.equals("dodawanie")){
            map.put("calculator", calculator.sum(firstNumber,secondNumber));
        }
        else if ( operation.equals("odejmowanie")){
                map.put("calculator", calculator.min(firstNumber,secondNumber));
        }
        else if ( operation.equals("mnozenie")){
            map.put("calculator", calculator.tim(firstNumber,secondNumber));
        }
        else if ( operation.equals("dzielenie")) {
            map.put("calculator", calculator.div(firstNumber, secondNumber));
        }
            return "result";

        }


}
