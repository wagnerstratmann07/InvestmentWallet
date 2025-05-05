package br.com.unicuritiba.InvestmentWallet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unicuritiba.InvestmentWallet.Models.*;

public interface InvestmentWallet_Repository extends JpaRepository<Wallet, Long> {
	

}
