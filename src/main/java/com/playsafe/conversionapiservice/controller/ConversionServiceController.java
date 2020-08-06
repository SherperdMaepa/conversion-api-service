package com.playsafe.conversionapiservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConversionServiceController
 */
@RestController
public class ConversionServiceController {

    @GetMapping("/conversions/ktoc/{value}")
    public double convertKelvinToCelsius(@PathVariable double value) {
        double result = Math.round((value - Constants.TEMP) * 100D) / 100D;
        System.out.println("Temperature from Kelvin to Celsius: " + result);
        return result;
    }

    @GetMapping("/conversions/ctok/{value}")
    public double convertCelsiusToKelvin(@PathVariable double value) {
        double result = Math.round((value + Constants.TEMP) * 100D) / 100D;
        System.out.println("Temperature from Celsius to Kelvin: " + result);
        return result;
    }

    @GetMapping("/conversions/mtok/{value}")
    public double convertMilesToKilometers(@PathVariable double value) {
        double result = Math.round((value * Constants.MILES) * 100D) / 100D;
        System.out.println("Distance from Miles to Kilometers: " + result);
        return result;
    }

    @GetMapping("/conversions/ktom/{value}")
    public double convertKilometersToMiles(@PathVariable double value) {
        double result = Math.round((value * Constants.KILOMETERS) * 100D) / 100D;
        System.out.println("Distance from Kilometers to Mile: " + result);
        return result;
    }
}
