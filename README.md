# conversion-api-service
Endpoint service application capable of serving scale conversion


http://localhost:8080/conversion-api-service/conversions/ktoc/{value}

The ktoc endpoint should produce an output amount in celsius when given an input amount in kelvin.


http://localhost:8080/conversion-api-service/conversions/ctok/{value}

The ctok endpoint should produce an output amount in kelvin when given an input amount in celsius.


http://localhost:8080/conversion-api-service/conversions/mtok/{value}

The mtok endpoint should produce, when given an input amount in miles, an output amount in kilometers.



http://localhost:8080/conversion-api-service/conversions/ktom/{value}

The ktom endpoint should produce, when given an input amount in kilometers, an output amount in miles.

