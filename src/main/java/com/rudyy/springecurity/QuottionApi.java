package com.rudyy.springecurity;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuottionApi {
    private List<Quottion> quotations;

    public QuottionApi() {
        this.quotations = new ArrayList<>();
        quotations.add(new Quottion("Иногда момент, который ты так долго ждал, приходит в самое неподходящее время..", "Kkkk"));
        quotations.add(new Quottion("Ничто из ничего не получается.", "Lllll"));
    }

    @GetMapping("/api")
    public List<Quottion> getQuotations() {
        return quotations;
    }

    @PostMapping("/api")
    public boolean addQuotation(@RequestBody Quottion quotation){
        return quotations.add(quotation);
    }

    @DeleteMapping("/api")
    public void deleteQuotation(@RequestParam int index){
          quotations.remove(index);
    }

}
