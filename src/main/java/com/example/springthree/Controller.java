package com.example.springthree;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    public final List<Motorvogn> motorvognRegister = new ArrayList<>();
    public final List<Bil> bilRegister = new ArrayList<>();

    public Controller () {
        Bil bil1 = new Bil("Toyota","R2-D2");
        bilRegister.add(bil1);
        Bil bil2 = new Bil("Toyota","C-P3O");
        bilRegister.add(bil2);
        Bil bil3 = new Bil("Toyota","R5-D4");
        bilRegister.add(bil3);
        Bil bil4 = new Bil("Suzuki","C1-10P");
        bilRegister.add(bil4);
        Bil bil5 = new Bil("Suzuki","BB-8");
        bilRegister.add(bil5);
        Bil bil6 = new Bil("Suzuki","L3-37");
        bilRegister.add(bil6);
    }

    @GetMapping("/hentBiler")
    public List<Bil> hentBiler() {
        return bilRegister;
    }

    @PostMapping("/lagre")
    public void lagreKunde(Motorvogn bil){
        motorvognRegister.add(bil);
    }

    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle(){
        return motorvognRegister;
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        motorvognRegister.clear();
    }
}

