package com.api.rest.Controller;
import com.api.rest.Model.Type;
import com.api.rest.Repo.TypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private TypeRepo typeRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return  "Welcome to the pokemon type page.<br><br>" +
                "To get a list of all types, go to /types <br>" +
                "To see info about a certain type, go to /info/id <br>" +
                "To add a type, go to /add <br>"+
                "To delete a type, go to /delete/id <br>" +
                "To update a type, go to /update/id <br>" +
                "A pokemon type consist of: <br>" +
                "   -String Type <br>"+
                "   -String strongAgainst <br>"+
                "   -String weakAgainst <br>"+
                "   -String resistantTo <br>"+
                "   -String weakTo <br>";
    }

    @GetMapping("/types")
    public List<Type> getTypes() {
        return typeRepo.findAll();
    }

    @GetMapping("/info/{id}")
    public Type getType(@PathVariable long id ){
        return typeRepo.findById(id).get();
    }

    @PostMapping("/add")
    public String newType(@RequestBody Type type) {
        typeRepo.save(type);
        return "Type added";
    }
    @PutMapping(value = "/update/{id}")
    public String updateType(@PathVariable long id, @RequestBody Type type) {
        Type updateType = typeRepo.findById(id).get();
        updateType.setTypename(type.getTypename());
        updateType.setId(type.getId());
        updateType.setStrongAgainst(type.getStrongAgainst());
        updateType.setResistantTo(type.getResistantTo());
        updateType.setWeakAgainst(type.getWeakAgainst());
        updateType.setWeakTo(type.getWeakTo());
        typeRepo.save(updateType);
        return "Type updated";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteType(@PathVariable long id) {
        Type deleteType = typeRepo.findById(id).get();
        typeRepo.delete(deleteType);
        return "type with id " + id + " deleted";
    }
}
