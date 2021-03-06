package br.com.project.listener;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@ApplicationScoped
public class ContextLoaderListenerCaixakiUtils extends ContextLoaderListener implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Esse m?todo retorna todo o contexto do spring
	 * @return
	 */
	private static WebApplicationContext getWAC() {
		return WebApplicationContextUtils.getWebApplicationContext(getCurrentWebApplicationContext().getServletContext());
	}
	
	public static Object getBean(String idNomeBean) {
		return getWAC().getBean(idNomeBean);
	}
	
	public static Object getBean(Class<?> classe) {
		return getWAC().getBean(classe);
	}

}
