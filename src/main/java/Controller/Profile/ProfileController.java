package Controller.Profile;

import Domain.Profile.Profile;
import Services.Profile.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bakery/Profile")
public class ProfileController {

    @Autowired
    @Qualifier("ServiceImpl")
    private ProfileService service;

    @PostMapping("/create")
    @ResponseBody
    public Profile create(Profile profile) {
        return service.create(profile);
    }

    @PostMapping("/update")
    @ResponseBody
    public Profile update(Profile profile) {
        return service.update(profile);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Profile read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Profile> getAll() {
        return service.getAll();
    }
}
