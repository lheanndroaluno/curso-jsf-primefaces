package br.com.srv.interfaces;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public interface ServiceEntidade extends Serializable {
	
	Date getUltimoAcessoEntidadeLogada(String login);

	void updateUltimoAcessoUser(String login);

	boolean existeUsuario(String ent_login);
}
