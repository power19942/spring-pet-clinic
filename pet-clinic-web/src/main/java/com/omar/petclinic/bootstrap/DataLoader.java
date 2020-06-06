package com.omar.petclinic.bootstrap;

import com.omar.petclinic.model.Owner;
import com.omar.petclinic.model.Vet;
import com.omar.petclinic.services.OwnerService;
import com.omar.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        var owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("omar");
        owner1.setLastName("jk");

        ownerService.save(owner1);

        var owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("ola");
        owner2.setLastName("jk");

        ownerService.save(owner2);

        var vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("sam");
        vet1.setLastName("axe");

        vetService.save(vet1);

        var vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("sam 2");
        vet2.setLastName("axe");

        vetService.save(vet2);

        System.out.println("data loaded");

    }
}
