package br.com.letscode.casa;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://api-harrypotter.herokuapp.com/house", name = "house")
public interface CasaRepository {

    @GetMapping("/{id}")
    Casa casa (@PathVariable (value = "id") String id);
}
