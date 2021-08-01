package dtk.springframework.sfgpetclinic.services;

import dtk.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface VetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
