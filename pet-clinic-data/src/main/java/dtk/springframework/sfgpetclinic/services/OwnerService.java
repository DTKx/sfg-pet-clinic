package dtk.springframework.sfgpetclinic.services;

import dtk.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findByID(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}