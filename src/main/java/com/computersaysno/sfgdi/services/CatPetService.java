package com.computersaysno.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service("petService")
public class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
