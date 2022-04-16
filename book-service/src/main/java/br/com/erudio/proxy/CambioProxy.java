package br.com.erudio.proxy;

import br.com.erudio.response.Cambio;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cambio-service")
public interface CambioProxy {
    @GetMapping(value = "/cambio-service/{amount}/{from}/{to}")
    public ResponseEntity<Cambio> findCambio(@PathVariable Double amount,
                                             @PathVariable String from, @PathVariable String to);

}
