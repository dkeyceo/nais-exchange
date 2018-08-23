package com.dkey.exchange.controller;

import com.dkey.exchange.entity.PV;
import com.dkey.exchange.repository.PVRepository;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("license/v1/")
public class PVController {
    @Inject
    private PVRepository pvRepository;

    @GET
    @Path("/inn/{inn}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<PV> getLicenseByDriverInn (@PathParam("inn") String inn){
        return pvRepository.getLicenseByDriverInn(inn);
    }

}
