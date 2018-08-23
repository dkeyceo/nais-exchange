package com.dkey.exchange.controller;



import com.dkey.exchange.entity.Car;
import com.dkey.exchange.repository.CarRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("cars/v1/")
public class CarController {
    @Inject
    private CarRepository carRepository;

    @GET
    @Path("/inn/{inn}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getCarByOwnerInn (@PathParam("inn") String inn){
        return carRepository.getCarByOwnerInn(inn);
    }

    @GET
    @Path("/nReg/{nreg}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getCarByNReg (@PathParam("nreg") String nReg){
        return carRepository.getCarByNReg(nReg);
    }
    @GET
    @Path("/vin/{vin}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getCarByVin (@PathParam("vin") String vin){
        return carRepository.getCarByVin(vin);
    }
    @GET
    @Path("/cert/{cert}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getCarByCert (@PathParam("cert") String cert){
        return carRepository.getCarByCert(cert);
    }
}

