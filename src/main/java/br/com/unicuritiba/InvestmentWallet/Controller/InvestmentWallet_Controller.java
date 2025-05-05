package br.com.unicuritiba.InvestmentWallet.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.unicuritiba.InvestmentWallet.Repository.*;
import br.com.unicuritiba.InvestmentWallet.Models.*;

@RestController
public class InvestmentWallet_Controller {

	    @Autowired
	    InvestmentWallet_Repository repository;

	    @GetMapping("/investment")
	    public ResponseEntity<List<Wallet>> getWallet() {
	        return ResponseEntity.ok(repository.findAll());
	    }

	    @PostMapping("/investment")
	    public ResponseEntity<Wallet> saveWallet(@RequestBody Wallet wallet) {
	        Wallet investimentoSalvo = repository.save(wallet);
	        return ResponseEntity.ok(investimentoSalvo);
	    }

	    @DeleteMapping("/investment/{id}")
	    public ResponseEntity<Void> removeInvestment(@PathVariable long id) {
	        repository.deleteById(id);
	        return ResponseEntity.noContent().build();
	    }

	    @PutMapping("/investment/{id}")
	    public ResponseEntity<Wallet> updateWallet(@PathVariable long id, @RequestBody Wallet wallet) {
	        if (!repository.existsById(id)) {
	            return ResponseEntity.notFound().build(); 
	        }
	        wallet.setId(id);
	        Wallet updatedWallet = repository.save(wallet);
	        return ResponseEntity.ok(updatedWallet);
	    }
	}

